package com.dot360.CrudWithChild.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dot360.CrudWithChild.dao.StudentRepository;
import com.dot360.CrudWithChild.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public void addStudent(Student student) {
		repository.save(student);
	}

	public List<Student> getStudents() {
		return repository.findAll();
	}
}
