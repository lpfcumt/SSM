package com.github.lpfcumt.SRS.service;


import java.util.ArrayList;
import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.domain.Student;
import com.github.lpfcumt.SRS.domain.Teacher;

public interface SectionService {
	
	/**
	 * @method 根据学期查询总课程表
	 * @author 林鹏飞
	 * @param semester
	 * @return HashMap
	 */
	HashMap<String ,Section> findBySemester(String semester);

	/**
	 * @method 根据courseId查询班次
	 * @author 林鹏飞
	 * @param courseId
	 * @return ArrayList<Section>
	 */
	ArrayList<Section> findSectionByCourseId(String courseId);
	
	/**
	 * @method 根据courseId查询班次
	 * @author 林鹏飞
	 * @param courseId
	 * @return ArrayList<Section>
	 */
	Section findSectionByCourseId(String courseId ,String sectionId);

	/**
	 * @method 添加课程
	 * @author 林鹏飞
	 * @param section
	 * @param semester 
	 */
	void addSection(Section section, String semester);

	/**
	 * @method 指派授课教师
	 * @author 林鹏飞
	 * @param teacher
	 * @param section
	 * @return
	 */
	boolean appointInstructor(Teacher teacher, String sectionId, String courseId);

	/**
	 * @method 更新班次信息
	 * @author 林鹏飞
	 * @param section
	 */
	void updateSection(Section section);

	/**
	 * @method 查询参加班次的学生
	 * @author 林鹏飞
	 * @param sectionId
	 * @return
	 */
	ArrayList<Student> findStudentBySectionId(String sectionId, String courseId);
}
