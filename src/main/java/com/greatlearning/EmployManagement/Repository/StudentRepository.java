package com.greatlearning.EmployManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
