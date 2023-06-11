package com.kabarak.clearance.repository.records;

import com.kabarak.clearance.model.records.Gown;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GownRepository extends JpaRepository<Gown,Long> {
    Gown findByStudentId(Long id);
}
