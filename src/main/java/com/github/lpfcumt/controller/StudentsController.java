package com.github.lpfcumt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.fastjson.JSONPObject;
import com.github.lpfcumt.pojo.Students;
import com.github.lpfcumt.service.StudentsService;
import com.github.lpfcumt.util.JavaEmail;
import com.github.lpfcumt.util.MailUtil;
import com.github.lpfcumt.util.SendEmail;

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
	@Autowired
	protected JavaEmail javaEmail;
	
	Map<String, Object> data =new HashMap<String,Object>();
	ModelAndView mView=new ModelAndView();
	
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
			@RequestParam String students_id ,
			@RequestParam int password,
			HttpSession session
			) throws Exception{
		
		Boolean login=studentsService.checkLogin(students_id,password);
		if (login) {
			 session.setAttribute("students", studentsService.queryById(students_id));
			 return ajaxSuccessResponse();
		} 
		else {
			return ajaxFailureResponse();
		}
	} 
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/sendLogin")
	@ResponseBody
	public ModelAndView sendLogin(HttpSession session) throws Exception{
		List<Students>  students=(List<Students>) session.getAttribute("students");
		if (!students.isEmpty()) {
			String students_id = null;
			for (Students students2 : students) {
				 students_id=students2.getStudents_id();
			}
			return studentsService.sendLogin(students_id);
		} 
		else {
			mView.setViewName("login");
			return mView;
		}
	}
	
	@RequestMapping(value="/exitLogin")
	@ResponseBody
	public ModelAndView exitLogin(HttpSession session) throws Exception{
		session.invalidate();
		mView.setViewName("login");
		return mView;
	}
	
	@RequestMapping(value="/addStudents")
	@ResponseBody
	public Map<String,Object > addStudents(String asc,Students students) throws Exception{
		try {
			studentsService.addStudents(students);
			return ajaxSuccessResponse();
		} catch (Exception e) {
			// TODO: handle exception
			return ajaxFailureResponse();
		}
		
		
	}
	
	@RequestMapping(value="/sendEmail")
	@ResponseBody
//	@Scheduled(cron="0/5 * *  * * ? ") 
	public void testScheduled() throws InterruptedException{
		javaEmail.sendHtmlEmail("1009925846@qq.com", "测试", "hello");		
		System.out.println("邮件已发送");	
	}
	
	
	
}
