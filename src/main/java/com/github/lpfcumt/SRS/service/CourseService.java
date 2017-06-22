package com.github.lpfcumt.SRS.service;

import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Course;

public interface CourseService {

	/**
	 * @method 查找所有课程
	 * @author 林鹏飞
	 * @return HashMap
	 */
	HashMap<String, Course> findAll();
}
