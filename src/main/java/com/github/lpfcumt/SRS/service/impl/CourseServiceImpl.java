package com.github.lpfcumt.SRS.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.lpfcumt.SRS.dao.CourseDao;
import com.github.lpfcumt.SRS.domain.Course;
import com.github.lpfcumt.SRS.service.CourseService;
import com.github.pagehelper.PageHelper;



@Service("courseService")
public class CourseServiceImpl implements CourseService{
	@Autowired// 把'@Autowired'改为'@Resource(name="courseMockDao")'，即可切换成sqlite数据源
	protected CourseDao courseDao;
	
	HashMap<String, Course> mapCourse = new HashMap<String ,Course>();
	ArrayList<Course> listCourse = new ArrayList<Course>();

	@Override
	public ArrayList<Course> findAll(int pageNum,int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		listCourse = courseDao.findAll();
//		for (Course course : listCourse) {
//			mapCourse.put(course.getCourseId(), course);
//		}
		return listCourse;
	}

	@Override
	public int countAllCourse() {
		return courseDao.countAllCourse();
	}

	@Override
	public void addCourse(Course course, String[] precourseIds) {
		courseDao.addCourse(course);
		for (String precoursId : precourseIds) {
			if (precourseIds.equals(""));
			else courseDao.addPreCourse(course.getCourseId(),precoursId);
		}
	}

	@Override
	public void updateCourse(Course course) {
		courseDao.updateCourse(course);
	}

	@Override
	public ArrayList<Course> fuzzyfindCourse(String search, int pageNumber, int pageSize) {
		PageHelper.startPage(pageNumber, pageSize);
		return courseDao.fuzzyfindCourse(search);
	}

}
