package com.github.lpfcumt.SRS.Specification;

import com.github.lpfcumt.SRS.domain.Course;
import com.github.lpfcumt.SRS.domain.Section;
import com.github.lpfcumt.SRS.domain.Student;
import com.github.lpfcumt.SRS.domain.Transcript;

public class IsSatisfyPreCourse  implements Specification{

	@Override
	public boolean enroll(Student student, Section section) {
		Transcript transcript = student.getTranscript();
		Course c = section.getRepresentedCourse();
		if (c.hasPrerequisites()) {
			for (Course pre : c.getPrerequisites()) {
				if (!transcript.verifyCompletion(pre)) {
					return false;
				}
			}
		}
		return true;
	}

}
