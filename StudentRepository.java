package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Student;


@RepositoryRestResource(path="stud")

public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	List<Student> findBySnameIgnoreCase(String sname);

}