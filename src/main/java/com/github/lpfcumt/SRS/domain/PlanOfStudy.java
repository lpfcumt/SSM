package com.github.lpfcumt.SRS.domain;

import java.util.HashMap;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 学习计划
 * @time 2017年6月19日下午3:10:58
 */
public class PlanOfStudy {
	private Student student; // 学生
	HashMap<String, Course> courseOffered; // 提供的课程
	HashMap<Student, PlanOfStudyEntry> planOfStudys; // 学习计划

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public PlanOfStudy(Student student){
		this.setStudent(student);
	}
	
	
}
