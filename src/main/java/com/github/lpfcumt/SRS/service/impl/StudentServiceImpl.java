package com.github.lpfcumt.SRS.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.lpfcumt.SRS.dao.StudentDao;
import com.github.lpfcumt.SRS.domain.Student;
import com.github.lpfcumt.SRS.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	@Resource(name="studentMockDao")
	protected StudentDao studentDao;
	
	ArrayList<Student> listAllStudent;
	HashMap<String , Student> mapStudent;
	
	@Override
	public HashMap<String, Student> findAllStudent() {
		mapStudent = new HashMap<String, Student>();
		for (Student student : studentDao.findAll()) {
			mapStudent.put(student.getId(), student);
		}
		return mapStudent;
	}

	@Override
	public boolean checkLogin(String id, String password) {
		if (studentDao.findStudentById(id) != null && password.equals(studentDao.findStudentById(id).getPassword())) return true;
		else return false;
	}

	@Override
	public Student findStudentById(String id) {
		return studentDao.findStudentById(id);
	}

}
