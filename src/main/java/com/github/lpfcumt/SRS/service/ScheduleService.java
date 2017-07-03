package com.github.lpfcumt.SRS.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.domain.Student;
import com.github.lpfcumt.SRS.domain.Teacher;

public interface ScheduleService {

	/**
	 * @method 根据学期查询总课程表
	 * @author 林鹏飞
	 * @param semester
	 * @return HashMap
	 */
	HashMap<String, Section> findBySemester(String semester);

	/**
	 * @method 查询教师课程表
	 * @author 林鹏飞
	 * @param teacher
	 * @param semester
	 * @return ArrayList
	 */
	ArrayList<Section> findScheduleBySemester(Teacher teacher, String semester);

	/**
	 * @method 
	 * @author 林鹏飞
	 * @param student
	 * @param search 
	 * @return ArrayList
	 */
	ArrayList<Section> findScheduleForStudent(Student student, String search);
}
