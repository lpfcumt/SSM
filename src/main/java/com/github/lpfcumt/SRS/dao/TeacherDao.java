package com.github.lpfcumt.SRS.dao;

import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Teacher;

public interface TeacherDao {
	
	/**
	 * @method 查找所有教师
	 * @author 林鹏飞
	 * @return HashMap
	 */
	HashMap<String, Teacher> findAll();
}
