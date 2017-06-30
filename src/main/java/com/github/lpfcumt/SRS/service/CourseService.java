package com.github.lpfcumt.SRS.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Course;
import com.github.lpfcumt.SRS.domain.Student;

public interface CourseService {

	/**
	 * @method 查找所有课程
	 * @author 林鹏飞
	 * @param pageSize 
	 * @param pageNumber 
	 * @return HashMap
	 */
	ArrayList<Course> findAll(int pageNumber, int pageSize);

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
	 * @param precourseId 
	 */
	void addCourse(Course course, String[] precourseId);

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
	 * @param pageSize 
	 * @param pageNumber 
	 * @return ArrayList
	 */
	ArrayList<Course> fuzzyfindCourse(String search, int pageNumber, int pageSize);

	/**
	 * @method 
	 * @author 林鹏飞
	 * @param student
	 * @param semester
	 * @param pageSize 
	 * @param pageNumber 
	 * @return
	 */
	ArrayList<Course> listCourseForStudent(Student student, String semester, int pageNumber, int pageSize);

	/**
	 * @method 
	 * @author 林鹏飞
	 * @param search
	 * @return int
	 */
	int countCourseForStudent(String search);
}
