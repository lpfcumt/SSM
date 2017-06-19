package com.github.lpfcumt.SRS.dao;

import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Course;

public interface CourseDao {
	
	/**
	 * @method 查找所有课程
	 * @author 林鹏飞
	 * @return HashMap
	 */
	HashMap<String , Course> findAll();

}
