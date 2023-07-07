package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.ApiResponse;
import com.app.entities.Student;
import com.app.repository.CourseRepository;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StuentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studRepo;
	@Autowired
	private CourseRepository courseRepo;
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studRepo.findAll();
	}
//	@Override
//	public ApiResponse addStudentDetails(Student transientStud) {
//		String msg="Student details are not added";
		
//		courseRepo.getById(transientStud.getCourse().getId());
//		return ;
//	}

}
