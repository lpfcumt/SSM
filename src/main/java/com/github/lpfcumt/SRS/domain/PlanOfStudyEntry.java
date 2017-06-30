package com.github.lpfcumt.SRS.domain;

public class PlanOfStudyEntry {
	
	private Student student;
	private Course course;
	private PlanOfStudyEntry planOfStudyEntry;
	
	public PlanOfStudyEntry(){
		
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public PlanOfStudyEntry getPlanOfStudyEntry() {
		return planOfStudyEntry;
	}
	public void setPlanOfStudyEntry(PlanOfStudyEntry planOfStudyEntry) {
		this.planOfStudyEntry = planOfStudyEntry;
	}
	
	
}
