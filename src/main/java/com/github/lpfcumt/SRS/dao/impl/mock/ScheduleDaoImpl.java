package com.github.lpfcumt.SRS.dao.impl.mock;

import org.springframework.stereotype.Repository;

import com.github.lpfcumt.SRS.dao.ScheduleDao;
import com.github.lpfcumt.SRS.domain.ScheduleOfClasses;

@Repository("scheduleDao")
public class ScheduleDaoImpl implements ScheduleDao{

	@Override
	public ScheduleOfClasses findScheduleOfClasses(String smaster) {
		// TODO Auto-generated method stub
		return null;
	}

}
