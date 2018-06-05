package com.myapp.service;

import java.util.List;

import com.myapp.model.Student;


public interface StudentService {

	// for  one to one mapping
	void saveStudent(Student student);
	
	List<Student> findAllStudents();

	void updateStudent(Student student);
	
}
