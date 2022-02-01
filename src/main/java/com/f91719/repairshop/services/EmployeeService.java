package com.f91719.repairshop.services;

import com.f91719.repairshop.data.entity.Employee;
import com.f91719.repairshop.dto.CreateEmployeeDTO;
import com.f91719.repairshop.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> findAll();
    Employee create(CreateEmployeeDTO employeeDTO);
}
