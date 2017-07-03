package com.github.lpfcumt.SRS.Specification;

import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.domain.Student;

public class ConfirmSeatAvailability implements Specification{

	@Override
	public boolean enroll(Student student, Section section) {
		if (!section.confirmSeatAvailability()) {
			return false;
		}
		return true;
	}

}
