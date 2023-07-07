package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.entities.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	//ApiResponse addStudentDetails(Student transientStud);
}
