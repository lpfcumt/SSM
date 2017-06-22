package com.github.lpfcumt.SRS.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.lpfcumt.SRS.dao.TeacherDao;
import com.github.lpfcumt.SRS.domain.Teacher;
import com.github.lpfcumt.SRS.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService{
	@Resource(name="teacherMockDao") // 把name值改为teacherDao，即可切换成sqlite数据源
	protected TeacherDao teacherDao;
	
	HashMap<String, Teacher> mapTeacher;
	ArrayList<Teacher> listTeacher;
	
	@Override
	public HashMap<String, Teacher> findAll() {
		mapTeacher = new HashMap<String, Teacher>();
		for (Teacher teacher : teacherDao.findAll()) {
			mapTeacher.put(teacher.getId(), teacher);
		}
		return mapTeacher;
	}

	@Override
	public boolean checkLogin(String id, String password) {
		if (teacherDao.findTeacherById(id) != null && password.equals(teacherDao.findTeacherById(id).getPassword())) return true; 
		else return false;
	}

	@Override
	public Teacher findTeacherById(String id) {
		return teacherDao.findTeacherById(id);
	}

}
