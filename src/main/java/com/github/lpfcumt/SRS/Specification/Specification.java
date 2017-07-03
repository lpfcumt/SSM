package com.github.lpfcumt.SRS.Specification;

import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.domain.Student;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 选课规约接口
 * @time 2017年7月3日下午10:56:31
 */
public interface Specification {
	
	/**
	 * @method 选课规约
	 * @author 林鹏飞
	 * @return EnrollmentStatus
	 */
	public boolean enroll(Student student, Section section);
}
