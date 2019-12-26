package com.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentList {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/student")
	public List<Student> getInput() {
		
		List<Student> ls = studentService.getAll();
		return studentService.getAll();
		}
	
	@RequestMapping("/created")
	public List<Student> addToDb() {
		
		List<Student> studentList = new ArrayList<Student>();
		
		Student yokesh = new Student();
	
		
		studentList.add(yokesh);


		yokesh.setId(103);
		yokesh.setName("Tahir");
		yokesh.setAddress("Santhoapuram");
		
		System.out.println(yokesh.getId());
		System.out.println(yokesh.getAddress());
		System.out.println(yokesh.getName());
		
		return studentList;
		
		
		
				}
	
}

	
