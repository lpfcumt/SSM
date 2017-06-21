package com.github.lpfcumt.SRS.dao.impl.mock;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.github.lpfcumt.SRS.dao.TeacherDao;
import com.github.lpfcumt.SRS.domain.Teacher;

@Repository("teacherDao")
public class TeacherDaoImpl implements TeacherDao{

	@Override
	public HashMap<String, Teacher> findAll() {
		// 创建HashMap对象
		HashMap<String, Teacher> listAllTeacher = new HashMap<String, Teacher>();
		// 创建Teacher变量
		Teacher tc1,tc2,tc3;
		// 创建teacher 对象
		tc1 = new Teacher("111111", "陈教授", "123456", "副教授", "数学");
		tc2 = new Teacher("222222", "张教授", "123456", "副教授", "市场营销");
		tc3 = new Teacher("333333", "杨教授", "123456", "副教授", "信息系统");
		
		// 为listAllTeacher添加数据
		listAllTeacher.put(tc1.getId(), tc1);
		listAllTeacher.put(tc2.getId(), tc2);
		listAllTeacher.put(tc3.getId(), tc3);
		return listAllTeacher;
	}

	@Override
	public Teacher findTeacherById(String id) {
		return findAll().get(id);
	}
	
	
}
