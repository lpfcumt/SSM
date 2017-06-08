package com.github.lpfcumt.domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.rewrite.MapRewritePolicy;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.github.lpfcumt.pojo.Students;

@Component
public class StudentsLogin {
	ModelAndView mView = new ModelAndView();
	Map<String , Object> map=new HashMap<String , Object>();
	
	
	public Boolean checkLogin(List<Students> list){
		if (list.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
		
	}

	public ModelAndView sendLogin(List<Students> list) {
		if (list.isEmpty()) {
			mView.setViewName("login");
			return mView;
		}
		else {
				
				map.put("students",list);
				mView.addObject("students",list);
				
			mView.setViewName("redirect:easyindex.jsp");
			return mView;
		}
		
	}

}
