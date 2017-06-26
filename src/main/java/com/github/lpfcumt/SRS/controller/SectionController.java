package com.github.lpfcumt.SRS.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.domain.Student;
import com.github.lpfcumt.SRS.domain.Teacher;
import com.github.lpfcumt.SRS.service.SectionService;
import com.github.lpfcumt.SRS.until.MapToList;

@Controller
@RequestMapping("/section")
public class SectionController extends BaseController{
	@Resource(name="sectionService")
	protected SectionService sectionService;
	@Autowired
	protected MapToList<Section> mapToList;
	
	@RequestMapping("/section")
	@ResponseBody
	public ModelAndView sendSection(HttpSession session) throws Exception{
		return new ModelAndView("section");
	}
	
	/*根据 courseId 查询班次*/
	@RequestMapping("/findSectionByCourseId")
	@ResponseBody
	public Map<String , Object> findSectionByCourseId(@RequestParam(required=true,defaultValue="0")int pageNumber,
			@RequestParam(required=true,defaultValue="5")int pageSize, HttpSession session, String courseId) throws Exception{
		
		Map<String, Object> map =new HashMap<String, Object>();
		map.put("rows",sectionService.findSectionByCourseId(courseId));
		return map;	
	}
	
	/*根据 sectionId 查询选课学生*/
	@RequestMapping("/findStudentBySectionId")
	@ResponseBody
	public Map<String, Object> findStudentBySectionId(String sectionId, String courseId) throws Exception{
		ArrayList<Student> students = sectionService.findStudentBySectionId(sectionId,courseId);
		data.put("rows", students);
		return data;
	}
	
	/*添加班次*/
	@RequestMapping("/addSection")
	@ResponseBody
	public Map<String, Object> addSection(Section section, HttpSession session) throws Exception{
		
		sectionService.addSection(section);
		return ajaxSuccessResponse();
	}
	
	/*修改班次信息*/
	@RequestMapping("/updateSection")
	@ResponseBody
	public Map<String, Object> updateSection(Section section, HttpSession session) throws Exception{
		
		sectionService.updateSection(section);
		return ajaxSuccessResponse();
	}
	
	/*指定授课教师*/
	@RequestMapping("/appointInstructor")
	@ResponseBody
	public Map<String, Object> appointInstructor(HttpSession session, Section section) throws Exception{
		
		Teacher teacher = (Teacher) session.getAttribute("teacher");
		if (sectionService.appointInstructor(teacher,section)) return ajaxSuccessResponse();
		else return ajaxFailureResponse();
	}
}
