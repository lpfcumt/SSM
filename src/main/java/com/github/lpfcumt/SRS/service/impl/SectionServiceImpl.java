package com.github.lpfcumt.SRS.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.lpfcumt.SRS.dao.SectionDao;
import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.service.SectionService;

@Service("sectionService")
public class SectionServiceImpl implements SectionService{
	@Resource(name="sectionMockDao")
	protected SectionDao sectionDao;
	
	ArrayList<Section> listSections = new ArrayList<Section>();
	HashMap<String, Section> mapSections= new HashMap<String, Section>();
	
	
	HashMap<String, Section> finAll(){
		return null;
		
	}

	@Override
	public HashMap<String, Section> findBySemester(String semester) {
		listSections = sectionDao.findBySemester(semester);
		for (Section section : listSections) {
			mapSections.put(section.getRepresentedCourse().getCourseId()+"-"+section.getSectionId(), section);
		}
		return mapSections;
	}
}
