package com.f91719.repairshop.data.repository;

import com.f91719.repairshop.data.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
