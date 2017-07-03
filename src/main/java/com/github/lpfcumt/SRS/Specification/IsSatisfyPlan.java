package com.github.lpfcumt.SRS.Specification;


import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.domain.Student;

public class IsSatisfyPlan implements Specification{

	@Override
	public boolean enroll(Student student, Section section) {
		if(!student.getPlanOfStudy().isInPlanOfStudy(section.getRepresentedCourse())){
			return false;
		}
		return true;
	}

}
