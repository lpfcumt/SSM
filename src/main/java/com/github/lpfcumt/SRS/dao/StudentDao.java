package com.github.lpfcumt.SRS.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.domain.Student;


public interface StudentDao{
	
	/**
	 * @method 查找所有学生
	 * @author 林鹏飞
	 * @return HashMap
	 */
	List<Student> findAll();
	
	/**
	 * @method 验证登录
	 * @author 林鹏飞
	 * @param id
	 * @return Student
	 */
	Student findStudentById(String id);
	
	/**
	 * @method 
	 * @author 林鹏飞
	 * @param id
	 * @return
	 */
	String query(String id);

	/**
	 * @method 根据班次查询学生
	 * @author 林鹏飞
	 * @param section
	 * @return ArrayList
	 */
	ArrayList<Student> findStudentBySectionId(@Param("sectionId")String sectionId, @Param("courseId")String courseId);
}