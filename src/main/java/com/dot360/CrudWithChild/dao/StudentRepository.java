package com.dot360.CrudWithChild.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dot360.CrudWithChild.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
