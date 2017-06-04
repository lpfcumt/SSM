package com.github.lpfcumt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONPObject;
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
	
	
	/**
	 * @method 查询所有students
	 * @author 林鹏飞
	 * @param asc
	 * @param pageNumber
	 * @param pageSize
	 * @return Map<String, Object>
	 * @throws Exception
	 */
	@RequestMapping(value="/queryAll")
	@ResponseBody
	public Map<String, Object> queryAll(String asc,
			@RequestParam(required = false, defaultValue = "0") int pageNumber,
            @RequestParam(required = false, defaultValue = "5") int pageSize
            ) throws Exception{
		data.put("total", studentsService.count());
		data.put("rows", studentsService.queryByPage(pageNumber, pageSize));
		return data;
		} 
	
	@RequestMapping(value="/query")
	@ResponseBody
	public Map<String, Object> query(String asc,@RequestParam int page,@RequestParam int rows) throws Exception{
		data.put("rows", studentsService.queryByPage(page, rows));
		data.put("total", studentsService.count());
		return data;
		} 
	
	@RequestMapping(value="/login")
	@ResponseBody
	public Map<String , Object> login(
			@RequestParam int students_id ,
			@RequestParam int password 
			) throws Exception{
		
		Boolean login=studentsService.checkLogin(students_id,password);
		if (login) {
			 return ajaxSuccessResponse();
		} 
		else {
			return ajaxFailureResponse();
		}
	} 
	
	@RequestMapping(value="/easyindex")
	@ResponseBody
	public ModelAndView returnEasyindex(HttpServletResponse resp) throws Exception{
		resp.sendRedirect("easyindex.jsp");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("easyindex");
		return modelAndView;
	}
	
}
