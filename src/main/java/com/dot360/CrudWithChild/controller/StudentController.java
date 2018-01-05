package com.dot360.CrudWithChild.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dot360.CrudWithChild.model.Student;
import com.dot360.CrudWithChild.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService service;

	@RequestMapping(method = RequestMethod.POST)
	public void addStudents(@RequestBody Student student) {
		service.addStudent(student);
	}

	@RequestMapping
	public List<Student> getStudents() {
		return service.getStudents();
	}
}
