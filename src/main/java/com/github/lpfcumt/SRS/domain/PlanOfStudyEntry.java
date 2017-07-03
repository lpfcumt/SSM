package com.github.lpfcumt.SRS.domain;

import java.util.ArrayList;

public class PlanOfStudyEntry {
	
	private Student student;
	ArrayList<Course> courseOffered; // 提供的课程
	
	
	public PlanOfStudyEntry(){	
		
		
	}
	
	public ArrayList<Course> getCourseOffered() {
		return courseOffered;
	}

	public void setCourseOffered(ArrayList<Course> courseOffered) {
		this.courseOffered = courseOffered;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
