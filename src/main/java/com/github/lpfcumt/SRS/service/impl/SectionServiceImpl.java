package com.github.lpfcumt.SRS.service.impl;

import java.util.ArrayList;
import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.lpfcumt.SRS.dao.ScheduleDao;
import com.github.lpfcumt.SRS.dao.SectionDao;
import com.github.lpfcumt.SRS.dao.StudentDao;
import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.domain.Student;
import com.github.lpfcumt.SRS.domain.Teacher;
import com.github.lpfcumt.SRS.service.SectionService;

@Service("sectionService")
public class SectionServiceImpl implements SectionService{
	@Autowired // 把'@Autowired'改为'@Resource(name="sectionMockDao")'，即可切换成sqlite数据源
	protected SectionDao sectionDao;
	@Autowired
	protected StudentDao studentDao;
	@Autowired 
	protected ScheduleDao scheduleDao;
	
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

	@Override
	public ArrayList<Section> findSectionByCourseId(String courseId) {
		listSections = sectionDao.findSectionByCourseId(courseId);
//		for (Section section : listSections) {
//			mapSections.put(section.getRepresentedCourse().getCourseId()+"-"+section.getSectionId(), section);
//		}
		return listSections;
	}

	@Override
	public void addSection(Section section, String semester) {
		sectionDao.addSection(section);
		scheduleDao.addSchedule(section,semester);
	}

	@Override
	public boolean appointInstructor(Teacher teacher, String sectionId, String courseId) {
		if (teacher.isInTeached(findSectionByCourseId(courseId,sectionId))) return false;
		else sectionDao.appointInstructor(teacher, sectionId, courseId);
		return true;
	}

	@Override
	public void updateSection(Section section) {
		sectionDao.updateSection(section);
	}

	@Override
	public ArrayList<Student> findStudentBySectionId(String sectionId, String dayOfWeek) {
		return studentDao.findStudentBySectionId(sectionId,dayOfWeek);
	}

	@Override
	public Section findSectionByCourseId(String courseId, String sectionId) {
		return sectionDao.findSectionByCourseId_SectionId(courseId, sectionId);
	}
}
