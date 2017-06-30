package com.github.lpfcumt.SRS.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.github.lpfcumt.SRS.domain.Student;
import com.github.lpfcumt.SRS.domain.TranscriptEntry;

public interface TranscriptDao {
	
	ArrayList<TranscriptEntry> findTranscriptForStudent(@Param("student")Student student);
}
