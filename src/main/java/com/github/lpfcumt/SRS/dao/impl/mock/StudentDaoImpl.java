package com.github.lpfcumt.SRS.dao.impl.mock;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.github.lpfcumt.SRS.dao.StudentDao;
import com.github.lpfcumt.SRS.domain.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	// 新建listAllStudent空集合
	HashMap<String, Student> listAllStudent = new HashMap<String,Student>();
			
	@Override
	public HashMap<String, Student> findAll() {
		// 新建student对象
		Student s1 = new Student("09143627", "林鹏飞", "123456", "2014", "电子商务");
		Student s2 = new Student("09143628", "张三", "123456", "2014", "电子商务");
		Student s3 = new Student("09143629", "李四", "123456", "2014", "电子商务");
		Student s4 = new Student("09143630", "赵五", "123456", "2014", "电子商务");
		// 为hashMap对象添加数据
		listAllStudent.put(s1.getId(), s1);
		listAllStudent.put(s2.getId(), s2);
		listAllStudent.put(s3.getId(), s3);
		listAllStudent.put(s4.getId(), s4);
		return listAllStudent;
	}

	@Override
	public Student findStudentById(String id) {
		listAllStudent = findAll();
		Student student = listAllStudent.get(id);
		return student;
	}



	

}
