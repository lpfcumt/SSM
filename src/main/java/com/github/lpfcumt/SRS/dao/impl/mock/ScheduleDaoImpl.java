package com.github.lpfcumt.SRS.dao.impl.mock;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.github.lpfcumt.SRS.dao.ScheduleDao;
import com.github.lpfcumt.SRS.dao.SectionDao;
import com.github.lpfcumt.SRS.domain.ScheduleOfClasses;

@Repository("scheduleMockDao")
public class ScheduleDaoImpl implements ScheduleDao{
	@Resource(name="sectionMockDao")
	protected SectionDao sectionDao;
	@Override
	public ScheduleOfClasses findScheduleOfClasses(String smaster) {
		// TODO Auto-generated method stub
		return null;
	}

}
