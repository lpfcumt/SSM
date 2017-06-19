package com.github.lpfcumt.SRS.dao;


import com.github.lpfcumt.SRS.domain.ScheduleOfClasses;

public interface ScheduleDao{
	
	/**
	 * @method 获取总课程表
	 * @author 林鹏飞
	 * @param smaster
	 * @return ScheduleOfClasses
	 */
	ScheduleOfClasses findScheduleOfClasses(String smaster);
	
	

}
