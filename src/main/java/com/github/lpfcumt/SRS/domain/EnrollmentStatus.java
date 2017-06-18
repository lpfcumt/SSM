package com.github.lpfcumt.SRS.domain;

public enum EnrollmentStatus {
	success("报名成功!  :o)"), 
	secFull("报名失败;  班次已排满.  :op"), 
	prereq("报名失败; 未满足前置课程.  :op"), 
	prevEnroll("报名失败; 已报名.  :op");

	// 枚举实例的值
	private final String value;

	
	EnrollmentStatus(String value) {
		this.value = value;
	}

	
	/**
	 * @method 对枚举实例的访问
	 * @author 林鹏飞
	 * @return String
	 */
	public String value() {
		return value;
	}
}
