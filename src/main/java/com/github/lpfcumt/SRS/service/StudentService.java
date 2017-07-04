package com.github.lpfcumt.SRS.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Course;
import com.github.lpfcumt.SRS.domain.Student;
import com.github.lpfcumt.SRS.domain.TranscriptEntry;

public interface StudentService {
	
	/**
	 * @method 查找所有学生
	 * @author 林鹏飞
	 * @return HashMap
	 */
	HashMap<String, Student> findAllStudent();
	
	/**
	 * @method 检查登录
	 * @author 林鹏飞
	 * @param id
	 * @param password
	 * @return boolean
	 */
	boolean checkLogin(String id, String password);
	
	/**
	 * @method 通过id查找学生
	 * @author 林鹏飞
	 * @param id
	 * @return Student
	 */
	Student findStudentById(String id);
	
	/**
	 * @method 
	 * @author 林鹏飞
	 * @param student
	 * @return
	 */
	ArrayList<TranscriptEntry> findTranscriptForStudent(Student student);

	/**
	 * @method 查询学习计划
	 * @author 林鹏飞
	 * @param student
	 * @return ArrayList
	 */
	ArrayList<Course> findPlanOfStudy(Student student);
	
}
