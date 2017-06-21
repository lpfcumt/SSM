package com.github.lpfcumt.SRS.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.lpfcumt.SRS.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentController extends BaseController{
	@Resource(name="studentService")
	protected StudentService studentService;
	
	@RequestMapping(value="/checklogin")
	@ResponseBody
	public Map<String, Object> checkLOgin(@RequestParam(required=true,defaultValue="0")String id,
			@RequestParam(required=true,defaultValue="0")String password, HttpSession session) throws Exception{
		
		if (studentService.checkLogin(id, password)){
			session.setAttribute("id",id);
			return ajaxSuccessResponse();
		}
		else return ajaxFailureResponse();	
	}

}
