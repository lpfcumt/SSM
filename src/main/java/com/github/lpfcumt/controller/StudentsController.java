package com.github.lpfcumt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	
	
	/**
	 * @method 查询所有students
	 * @author 林鹏飞
	 * @param asc
	 * @param pageNumber
	 * @param pageSize
	 * @return Map<String, Object>
	 * @throws Exception
	 */
	@RequestMapping(value="/queryAll",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryAll(String asc,
			@RequestParam(required = false, defaultValue = "0") int pageNumber,
            @RequestParam(required = false, defaultValue = "5") int pageSize
            ) throws Exception{
		Map<String, Object> data =new HashMap<String,Object>();
		data.put("total", studentsService.count());
		data.put("rows", studentsService.queryByPage(pageNumber, pageSize));
		return data;
		} 
	
	@RequestMapping(value="/query",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> query() throws Exception{
		JSONPObject jsonpObject=new JSONPObject();
		Map<String, Object> data =new HashMap<String,Object>();
		data.put("rows", studentsService.queryAll());
		
		return data;
		} 
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		ModelAndView mView=new ModelAndView("easyindex","massage","hello world!");
		mView.addObject("mm", "13215");
		return mView;	
	} 
	
	@RequestMapping(value="/easyindex")
	@ResponseBody
	public void returnEasyindex(HttpServletResponse resp) throws Exception{
		
		resp.sendRedirect("easyindex.jsp");
	}
	
}
