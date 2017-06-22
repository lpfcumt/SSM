package com.github.lpfcumt.SRS.service;

import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Section;

public interface ScheduleService {

	/**
	 * @method 根据学期查询总课程表
	 * @author 林鹏飞
	 * @param semester
	 * @return HashMap
	 */
	HashMap<String, Section> findBySemester(String semester);
}
