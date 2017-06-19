package com.github.lpfcumt.SRS.domain;

import java.util.HashMap;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 班次类
 * @time 2017年6月16日下午4:52:54
 */
public class Section {
	private int sectionId; // 班次编号
	private char dayOfWeek; // 星期几
	private String timeOfDay; // 一天的时间
	private String room; // 教室
	private int seatingCapacity; // 座位
	private Course representedCourse; // 前置课程
	private ScheduleOfClasses offeredIn; // 提供的班级
	private Teacher instructor; // 指导教师
	/**
	* @Fields enrolledStudents : TODO(参加班次的学生)
	*/
	private HashMap<String, Student> enrolledStudents; // 参加班次的学生
	private HashMap<Student, TranscriptEntry> assignedGrades; // 成绩等级
	
	public int getSectionId() {
		return sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	public char getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(char dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getTimeOfDay() {
		return timeOfDay;
	}
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public Course getRepresentedCourse() {
		return representedCourse;
	}
	public void setRepresentedCourse(Course representedCourse) {
		this.representedCourse = representedCourse;
	}
	public ScheduleOfClasses getOfferedIn() {
		return offeredIn;
	}
	public void setOfferedIn(ScheduleOfClasses offeredIn) {
		this.offeredIn = offeredIn;
	}
	public Teacher getInstructor() {
		return instructor;
	}
	public void setInstructor(Teacher instructor) {
		this.instructor = instructor;
	}
	
	public Section(int sectionId, char dayOfWeek, String timeOfDay,Course representedCourse, String room, int seatingCapacity
			) {
		super();
		this.setSectionId(sectionId);
		this.setDayOfWeek(dayOfWeek);
		this.setTimeOfDay(timeOfDay);
		this.setRoom(room);
		this.setSeatingCapacity(seatingCapacity);
		this.setRepresentedCourse(representedCourse);
		setInstructor(null);
		enrolledStudents = new HashMap<String,Student>();
		assignedGrades = new HashMap<Student,TranscriptEntry>();
	}
	
	@Override
	public String toString() {
		return getRepresentedCourse().getCourseId() + " - " +
		       getSectionId() + " - " +
		       getDayOfWeek() + " - " +
		       getTimeOfDay();
	}
	
	/**
	 * @method 获取全部班次的编号
	 * @author 林鹏飞
	 * @return String
	 */
	public String getFullSectionId() {
		return getRepresentedCourse().getCourseId() + 
		       " - " + getSectionId();
	}
	
	/**
	 * @method 获取全部班次的信息
	 * @author 林鹏飞
	 * @return String
	 */
	public String getFullSectionInfo() {
		return getRepresentedCourse().getCourseName() + 
			   "-" + getDayOfWeek() + "-" +
		       "" + getTimeOfDay() +
		       "-" + this.getRoom();
	}
	
	/**
	 * @method 验证是否能参加该班次课程
	 * @author 林鹏飞
	 * @param student
	 * @return EnrollmentStatus
	 */
	public EnrollmentStatus enroll(Student student) {
		Transcript transcript = student.getTranscript();
		// 判断学生是否参加过类似的课程，或者参加过并没有通过考试
		if (student.isCurrentlyEnrolledSimilar(this) || 
		    transcript.verifyCompletion(this.getRepresentedCourse())) {
			return EnrollmentStatus.prevEnroll;
		}

		// 判断学生是否满足该课程的前置课程
		Course c = this.getRepresentedCourse();
		if (c.hasPrerequisites()) {
			for (Course pre : c.getPrerequisites()) {
				if (!transcript.verifyCompletion(pre)) {
					return EnrollmentStatus.prereq;
				}
			}
		}
		
		// 判断班次学生数量是否已满
		if (!this.confirmSeatAvailability()) {
			return EnrollmentStatus.secFull;
		}
		
		// 双向绑定
		enrolledStudents.put(student.getId(), student);
		student.addSection(this);
		return EnrollmentStatus.success;
	}
	
	/**
	 * @method 获取成绩等级
	 * @author 林鹏飞
	 * @param student
	 * @return String
	 */
	public String getGrade(Student student) {
		String grade = null;

		
		TranscriptEntry transcriptEntry = assignedGrades.get(student);
		if (transcriptEntry != null) {
			grade = transcriptEntry.getGrade(); 
		}

		return grade;
	}
	
	/**
	 * @method 确定座位是否已满
	 * @author 林鹏飞
	 * @return boolean
	 */
	private boolean confirmSeatAvailability() {
		if (enrolledStudents.size() < getSeatingCapacity()) return true;
		else return false;
	}

	/**
	 * @method 退选课程
	 * @author 林鹏飞
	 * @param student
	 * @return boolean
	 */
	public boolean drop(Student student) {
	
		if (!student.isEnrolledIn(this)) return false;
		else {
			// 从参加课程的学生中移除
			enrolledStudents.remove(student.getId());
			student.dropSection(this);
			return true;
		}
	}

	/**
	 * @method 获取参加班次学生的总数
	 * @author 林鹏飞
	 * @return int
	 */
	public int getTotalEnrollment() {
		return enrolledStudents.size();
	}	

	public void display() {
		System.out.println("Section Information:");
		System.out.println("\tSemester:  " + getOfferedIn().getSemester());
		System.out.println("\tCourse No.:  " + 
				   getRepresentedCourse().getCourseId());
		System.out.println("\tSection No:  " + getSectionId());
		System.out.println("\tOffered:  " + getDayOfWeek() + 
				   " at " + getTimeOfDay());
		System.out.println("\tIn Room:  " + getRoom());
		if (getInstructor() != null) 
			System.out.println("\tProfessor:  " + 
				   getInstructor().getName());
		displayStudentRoster();
	}
	
	public void displayStudentRoster() {
		System.out.print("\tTotal of " + getTotalEnrollment() + 
				   " students enrolled");
		if (getTotalEnrollment() == 0) System.out.println(".");
		else System.out.println(", as follows:");
		for (Student s : enrolledStudents.values()) {
			System.out.println("\t\t" + s.getName());
		}
	}
	
	public boolean postGrade(Student student, String grade) {
		// 判断成绩等级是否正确.
		if (!TranscriptEntry.validateGrade(grade)) return false;

		// Make sure that we haven't previously assigned a
		// grade to this Student by looking in the HashMap
		// for an entry using this Student as the key.  If
		// we discover that a grade has already been assigned,
		// we return a value of false to indicate that
		// we are at risk of overwriting an existing grade.  
		// (A different method, eraseGrade(), can then be written
		// to allow a Professor to change his/her mind.)

		if (assignedGrades.get(student) != null) return false;

		// First, we create a new TranscriptEntry object.  Note
		// that we are passing in a reference to THIS Section,
		// because we want the TranscriptEntry object,
		// as an association class ..., to maintain
		// "handles" on the Section as well as on the Student.
		// (We'll let the TranscriptEntry constructor take care of
		// linking this T.E. to the correct Transcript.)

		TranscriptEntry te = new TranscriptEntry(student, grade, this);

		// Then, we "remember" this grade because we wish for
		// the connection between a T.E. and a Section to be
		// bidirectional.

		assignedGrades.put(student, te);

		return true;
	}
	
	/**
	 * @method 验证该班次是否属于该课程
	 * @author 林鹏飞
	 * @param course
	 * @return boolean
	 */
	public boolean isSectionOf(Course course) {
		if (course == representedCourse) return true;
		else return false;
	}
}
