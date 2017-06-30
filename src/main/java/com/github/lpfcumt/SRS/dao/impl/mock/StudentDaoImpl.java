package com.github.lpfcumt.SRS.dao.impl.mock;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.github.lpfcumt.SRS.dao.StudentDao;
import com.github.lpfcumt.SRS.domain.Student;


@Repository("studentMockDao")
public class StudentDaoImpl implements StudentDao{
	
	// 新建listAllStudent空集合
	ArrayList<Student> listAllStudent;
	HashMap<String , Student> mapStudent;
			
	@Override
	public ArrayList<Student> findAll() {
		// 实例化集合对象
		listAllStudent = new ArrayList<Student>();
		// 新建student对象
		Student s1 = new Student("09143627", "林鹏飞", "123456", "2014", "电子商务");
		Student s2 = new Student("09143628", "张三", "123456", "2014", "电子商务");
		Student s3 = new Student("09143629", "李四", "123456", "2014", "电子商务");
		Student s4 = new Student("09143630", "赵五", "123456", "2014", "电子商务");
		// 为hashMap对象添加数据
		listAllStudent.add(s1);
		listAllStudent.add(s2);
		listAllStudent.add(s3);
		listAllStudent.add(s4);
		return listAllStudent;
	}

	@Override
	public Student findStudentById(String id) {
		for (Student student : findAll()) {
			if (student.getId().equals(id))return student;

		}
		return null;
	}

	@Override
	public String query(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Student> findStudentBySectionId(String sectionId, String dayOfWeek) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countStudentOfSection(String sectionId, String courseId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Student> findStudentForGrade(String courseId, String sectionId, String semester) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countStudentForGrade(String courseId, String sectionId, String search) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void appointGrade(String courseId, String sectionId, String studentId, String grade) {
		// TODO Auto-generated method stub
		
	}



	

}
