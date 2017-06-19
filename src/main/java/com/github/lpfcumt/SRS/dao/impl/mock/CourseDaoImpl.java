package com.github.lpfcumt.SRS.dao.impl.mock;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.github.lpfcumt.SRS.dao.CourseDao;
import com.github.lpfcumt.SRS.domain.Course;

@Repository("courseDao")
public class CourseDaoImpl implements CourseDao{
	
	@Override
	public HashMap<String, Course> findAll() {
		// 创建新的hashMap容器
		HashMap<String, Course> listAllCourse = new HashMap<String , Course>();

		// 创建Course 对象
		Course c1 = new Course("ABC-101", "信息系统分析与设计（上）", 2.5);
		Course c2 = new Course("ABC-102", "信息系统分析与设计（下）", 2.5);
		Course c3 = new Course("ABC-103", "网络营销", 2.5);
		Course c4 = new Course("ABC-104", "高等数学（上）", 2.5);
		
		// 为course对象添加前置课程
		c1.addPrerequisite(c4);
		c2.addPrerequisite(c1);
		c3.addPrerequisite(c2);
		
		// 为hashmap对象加载数据
		listAllCourse.put(c1.getCourseId(), c1);
		listAllCourse.put(c2.getCourseId(), c2);
		listAllCourse.put(c3.getCourseId(), c3);
		listAllCourse.put(c4.getCourseId(), c4);	
		return listAllCourse;
	}

}
