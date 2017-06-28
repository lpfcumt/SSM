package com.github.lpfcumt.SRS.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.lpfcumt.SRS.domain.Teacher;
import com.github.lpfcumt.SRS.service.ScheduleService;

@Controller
@RequestMapping("/schedule")
public class ScheduleController extends BaseController{
	@Resource(name="scheduleService")
	protected ScheduleService scheduleService;
	
	@RequestMapping("/teacherSchedule")
	@ResponseBody
	public ModelAndView teacherSchedule() throws Exception{
		return new ModelAndView("teacherSchedule");
	}
	
	@RequestMapping("/listScheduleOfTeacher")
	@ResponseBody
	public Map<String, Object> listScheduleOfTeacher(@RequestParam(required=true,defaultValue="0")int pageNumber,
			@RequestParam(required=true,defaultValue="0")int pageSize,HttpSession session,String search) throws Exception{
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		if (search.equals("")) return data;
		else {
			data.put("rows", scheduleService.findScheduleBySemester(teacher,search));
			return data;
		}
	}

}
