package com.github.lpfcumt.SRS.domain;

import java.util.HashMap;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 课程计划 
 * @time 2017年6月16日下午5:56:19
 */
public class ScheduleOfClasses {
	private String semester; // 学期
	private HashMap<String, Section> sectionsOffered; // 提供的班次集合

	public ScheduleOfClasses(String semester) {
		setSemester(semester);
		sectionsOffered = new HashMap<String, Section>();
	}

	public ScheduleOfClasses(String semester, HashMap<String, Section> sectionsOffered ) {
		setSemester(semester);
		
		// 实例化支持空的集合
		this.sectionsOffered = sectionsOffered;
	}
	
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getSemester() {
		return semester;
	}
	public HashMap<String, Section> getSectionsOffered() {
		return sectionsOffered;
	}

	
	public void display() {
		System.out.println("课程计划： " + getSemester());
		System.out.println();

		for (Section s : sectionsOffered.values()) {
			s.display();
			System.out.println();
		}
	}

	/**
	 * @method 添加班次
	 * @author 林鹏飞
	 * @param section
	 */
	public void addSection(Section section) {
		String key = section.getRepresentedCourse().getCourseId() + 
			     " - " + section.getSectionId();
		sectionsOffered.put(key, section);

		section.setOfferedIn(this);
	}

	// The full section number is a concatenation of the
	// course no. and section no., separated by a hyphen;
	// e.g., "ART101 - 1".

	public Section findSection(String fullSectionNo) {
		return sectionsOffered.get(fullSectionNo);
	}

	public boolean isEmpty() {
		if (sectionsOffered.size() == 0) return true;
		else return false;
	}
}
