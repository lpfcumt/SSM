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

	/**
	 * @method 统计参与班次的学生总数 
	 * @author 林鹏飞
	 * @param sectionId
	 * @param courseId
	 * @return int
	 */
	int countStudentOfSection(@Param("sectionId")String sectionId, @Param("courseId")String courseId);

	/**
	 * @method 
	 * @author 林鹏飞
	 * @param courseId
	 * @param sectionId
	 * @param semester
	 * @return
	 */
	ArrayList<Student> findStudentForGrade(@Param("courseId")String courseId, @Param("sectionId")String sectionId, @Param("semester")String semester);

	/**
	 * @method 
	 * @author 林鹏飞
	 * @param courseId
	 * @param sectionId
	 * @param search
	 * @return
	 */
	int countStudentForGrade(@Param("courseId")String courseId, @Param("sectionId")String sectionId, @Param("semester")String semester);

	/**
	 * @method 
	 * @author 林鹏飞
	 * @param courseId
	 * @param sectionId
	 * @param studentId
	 * @param grade 
	 */
	void appointGrade(@Param("courseId")String courseId, @Param("sectionId")String sectionId, @Param("studentId")String studentId, @Param("grade")String grade);
}