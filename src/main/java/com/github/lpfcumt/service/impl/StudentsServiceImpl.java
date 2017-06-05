/**
 * @author 林鹏飞
 * @since JDK1.8
 * @describe 
 * @time 2017年6月1日下午6:46:18
 */
package com.github.lpfcumt.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.github.lpfcumt.dao.StudentsDao;
import com.github.lpfcumt.domain.StudentsLogin;
import com.github.lpfcumt.pojo.Students;
import com.github.lpfcumt.service.StudentsService;
import com.github.pagehelper.PageHelper;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 
 * @time 2017年6月1日下午6:46:18
 */
@Service("studentsService")
public class StudentsServiceImpl implements StudentsService {
	
	@Autowired
	private StudentsDao studentsDao;
	@Autowired
	private StudentsLogin studentslogin;

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		studentsDao.deleteById(id);
	}

	@Override
	public List<Students> queryAll() {
		// TODO Auto-generated method stub
		return studentsDao.queryAll();
	}

	@Override
	public List<Students> queryByPage(int pageNumber,int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNumber, pageSize);
		return studentsDao.queryAll();
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return studentsDao.count();
	}

	@Override
	public Boolean checkLogin(String students_id, int password) {
		// TODO Auto-generated method stub
		return studentslogin.checkLogin(studentsDao.checkLogin(students_id, password));
		
	}

	@Override
	public ModelAndView sendLogin(String students_id) {
		// TODO Auto-generated method stub
		return studentslogin.sendLogin(studentsDao.queryById(students_id));
	}

	@Override
	public List<Students> queryById(String students_id) {
		// TODO Auto-generated method stub
		return studentsDao.queryById(students_id);
	}
	
	
	

}
