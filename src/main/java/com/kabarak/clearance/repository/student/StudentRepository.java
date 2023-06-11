package com.kabarak.clearance.repository.student;

import com.kabarak.clearance.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Boolean existsByRegNo(String regNo);

    Student findByRegNo(String regNo);
    Student findByUserId(Long id);

}