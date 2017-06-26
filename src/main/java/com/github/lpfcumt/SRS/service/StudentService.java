package com.github.lpfcumt.SRS.service;

import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Student;

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
	
}
