package com.github.lpfcumt.SRS.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.github.lpfcumt.SRS.domain.Section;

public interface SectionDao {
	
	/**
	 * @method 获取所有班次
	 * @author 林鹏飞
	 * @return ArrayList<Section>
	 */
	ArrayList<Section> findAll();
	
	/**
	 * @method 根据学期获取班次
	 * @author 林鹏飞
	 * @param semester
	 * @return HashMap<String, Section>
	 */
	HashMap<String, Section> findBySemester(String semester);
}
