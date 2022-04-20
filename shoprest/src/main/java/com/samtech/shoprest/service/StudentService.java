package com.samtech.shoprest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.DispatcherServlet;

import com.samtech.shoprest.model.Account;
import com.samtech.shoprest.model.Student;
import com.samtech.shoprest.repository.StudentRepository;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository ) {
		
		this.studentRepository = studentRepository;
		
	}
	
	public Iterable<Student> findAllStudents() {
		
			Iterable<Student> student1 =  studentRepository.findAll();
		
			return student1;
	
	}
	
	public Student saveStudent( Student student) {
		
		Student student1= studentRepository.save(student);
		
		return student1;
		
	}
	public Optional<Student> findStudentById( long id) {
		
		Optional<Student> student1 = studentRepository.findById(id);
		
		return student1;	
	} 
	
	public void deleteStudent(long id) {
		
		//Optional<Student> student1 = Optional.empty();
		
		studentRepository.deleteById(id);
		
	}		
}
	

