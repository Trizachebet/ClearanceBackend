package com.kabarak.clearance.repository.department;

import com.kabarak.clearance.model.department.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
