package com.kabarak.clearance.repository.graduation;

import com.kabarak.clearance.model.hod.GraduationList;
import com.kabarak.clearance.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GraduationListRepository  extends JpaRepository<GraduationList,Long> {
    @Query("SELECT g  FROM GraduationList g where g.student = :stude")
    GraduationList findByStudent(Student stude);

}
