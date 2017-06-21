package com.github.lpfcumt.SRS.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.lpfcumt.SRS.dao.TeacherDao;
import com.github.lpfcumt.SRS.domain.Teacher;
import com.github.lpfcumt.SRS.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService{
	@Resource(name="teacherDao")
	protected TeacherDao teacherDao;
	
	
	@Override
	public HashMap<String, Teacher> findAllStudent() {
		return teacherDao.findAll();
	}

	@Override
	public boolean checkLogin(String id, String password) {
		if (password.equals(findTeacherById(id).getPassword())) return true; 
		else return false;
	}

	@Override
	public Teacher findTeacherById(String id) {
		return findTeacherById(id);
	}

}
