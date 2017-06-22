package com.github.lpfcumt.SRS.dao;

import java.util.ArrayList;
import com.github.lpfcumt.SRS.domain.Course;

public interface CourseDao {
	
	/**
	 * @method 查找所有课程
	 * @author 林鹏飞
	 * @return ArrayList
	 */
	ArrayList<Course> findAll();
	
	
}
