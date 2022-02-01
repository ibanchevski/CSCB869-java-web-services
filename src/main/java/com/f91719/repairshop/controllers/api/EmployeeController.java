package com.f91719.repairshop.controllers.api;

import com.f91719.repairshop.data.entity.Employee;
import com.f91719.repairshop.data.entity.Qualification;
import com.f91719.repairshop.dto.CreateEmployeeDTO;
import com.f91719.repairshop.dto.EmployeeDTO;
import com.f91719.repairshop.dto.EmployeeRepairShopDTO;
import com.f91719.repairshop.models.CreateEmployeeViewModel;
import com.f91719.repairshop.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    private final ModelMapper modelMapper;

    @GetMapping
    public List<EmployeeDTO> getEmployees() {
        return employeeService.findAll();
    }

    @PostMapping
    public Employee createEmployee(@Valid @RequestBody CreateEmployeeViewModel employee) {
        return employeeService.create(modelMapper.map(employee, CreateEmployeeDTO.class));
    }
}
