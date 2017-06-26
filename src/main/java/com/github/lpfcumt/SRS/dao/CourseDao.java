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

	/**
	 * @method 查询总课程数量
	 * @author 林鹏飞
	 * @return int
	 */
	int countAllCourse();

	/**
	 * @method 添加课程
	 * @author 林鹏飞
	 * @param course
	 */
	void addCourse(Course course);

	/**
	 * @method 更新课程
	 * @author 林鹏飞
	 * @param course
	 */
	void updateCourse(Course course);

	/**
	 * @method 模糊查询课程
	 * @author 林鹏飞
	 * @param search
	 * @return ArrayList
	 */
	ArrayList<Course> fuzzyfindCourse(String search);
	
	
}
