package com.kabarak.clearance.repository.finance;

import com.kabarak.clearance.model.finance.Finance;
import com.kabarak.clearance.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FinanceRepository extends JpaRepository<Finance, Long> {

    @Query("SELECT f FROM Finance f where f.student = :stude")
    Finance findByStudentId(Student stude);
}
