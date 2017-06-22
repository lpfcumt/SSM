package com.github.lpfcumt.SRS.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.lpfcumt.SRS.dao.CourseDao;
import com.github.lpfcumt.SRS.domain.Course;
import com.github.lpfcumt.SRS.service.CourseService;



@Service("courseService")
public class CourseServiceImpl implements CourseService{
	@Resource(name="courseMockDao")
	protected CourseDao courseDao;
	
	HashMap<String, Course> mapCourse = new HashMap<String ,Course>();
	ArrayList<Course> listCourse = new ArrayList<Course>();

	@Override
	public HashMap<String, Course> findAll() {
		listCourse = courseDao.findAll();
		for (Course course : listCourse) {
			mapCourse.put(course.getCourseId(), course);
		}
		return mapCourse;
	}

}
