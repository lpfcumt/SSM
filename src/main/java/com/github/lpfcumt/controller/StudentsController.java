package com.github.lpfcumt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.lpfcumt.service.StudentsService;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe studentsController
 * @time 2017年6月1日下午7:10:54
 */

@Controller
@RequestMapping("/")
public class StudentsController extends BaseController{
	@Autowired
	protected StudentsService studentsService;
	
	Map<String, Object> data =new HashMap<String,Object>();
	
	@RequestMapping(value="/queryAll",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryAll() throws Exception{
		data.put("allstudents", studentsService.queryAll());
		return data;
		} 
		
}
