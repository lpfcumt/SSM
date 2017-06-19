package com.github.lpfcumt.SRS.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.lpfcumt.SRS.dao.StudentDao;
import com.github.lpfcumt.SRS.domain.Student;
import com.github.lpfcumt.SRS.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	@Resource(name="studentDao")
	protected StudentDao studentDao;
	
	
	@Override
	public HashMap<String, Student> findAllStudent() {
		
		return null;
	}

	@Override
	public boolean checkLogin(String id, String password) {
		Student student = studentDao.findStudentById(id);
		if (password.equals(student.getPassword())) {
			return true;
		}
		return false;
	}

}
