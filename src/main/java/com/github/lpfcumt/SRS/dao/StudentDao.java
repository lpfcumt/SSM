package com.github.lpfcumt.SRS.dao;

import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Student;

public interface StudentDao{
	
	/**
	 * @method 查找所有学生
	 * @author 林鹏飞
	 * @return HashMap
	 */
	HashMap<String, Student> findAll();
	
	/**
	 * @method 验证登录
	 * @author 林鹏飞
	 * @param id
	 * @return Student
	 */
	Student findStudentById(String id);
}