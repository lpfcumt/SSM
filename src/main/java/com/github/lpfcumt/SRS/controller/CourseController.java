package com.github.lpfcumt.SRS.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.lpfcumt.SRS.domain.Course;
import com.github.lpfcumt.SRS.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController extends BaseController{
	@Resource(name="courseService")
	protected CourseService courseService;
	
	@RequestMapping(value="/listAllCourse")
	@ResponseBody
	public Map<String, Object> listAllCourse(HttpSession session) throws Exception{
		data.put("allCourse", courseService.findAll());
		return data;	
	}
	
	@RequestMapping(value="/addCourse")
	@ResponseBody
	public Map<String, Object> addCourse(Course course,HttpSession session) throws Exception{
		return data;
	}
}
