package com.kabarak.clearance.repository.library;

import com.kabarak.clearance.model.library.Library;
import com.kabarak.clearance.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LibraryRepository extends JpaRepository<Library, Long> {

    @Query("SELECT l  FROM Library l where l.student = :stude")
    Library findByStudent(Student stude);
}
