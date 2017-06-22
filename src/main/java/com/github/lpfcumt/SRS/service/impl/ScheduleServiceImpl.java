package com.github.lpfcumt.SRS.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.lpfcumt.SRS.dao.ScheduleDao;
import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.service.ScheduleService;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService{
	@Resource(name="scheduleMockDao")
	protected ScheduleDao scheduleDao;
	
	ArrayList<Section> sections = new ArrayList<Section>();
	
	@Override
	public HashMap<String, Section> findBySemester(String semester) {
		
		return null;
	}
}
