package com.github.lpfcumt.SRS.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.lpfcumt.SRS.dao.ScheduleDao;
import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.domain.Teacher;
import com.github.lpfcumt.SRS.service.ScheduleService;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService{
	@Autowired // 把'@Autowired'改为'@Resource(name="scheduleMockDao")'，即可切换成sqlite数据源
	protected ScheduleDao scheduleDao;
	
	ArrayList<Section> sections = new ArrayList<Section>();
	
	@Override
	public HashMap<String, Section> findBySemester(String semester) {
		
		return null;
	}

	@Override
	public ArrayList<Section> findScheduleBySemester(Teacher teacher, String semester) {
		return scheduleDao.findScheduleBySemester(teacher, semester);
	}
}
