package com.f91719.repairshop.services.implementations;

import com.f91719.repairshop.data.entity.Employee;
import com.f91719.repairshop.data.repository.EmployeeRepository;
import com.f91719.repairshop.dto.CreateEmployeeDTO;
import com.f91719.repairshop.dto.EmployeeDTO;
import com.f91719.repairshop.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<EmployeeDTO> findAll() {
        return employeeRepository
                .findAll(Sort.by("id"))
                .stream()
                .map(this::convertToEmployeeDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Employee create(CreateEmployeeDTO employeeDTO) {
        return employeeRepository.save(modelMapper.map(employeeDTO, Employee.class));
    }

    private EmployeeDTO convertToEmployeeDTO(Employee employee) {
        return modelMapper.map(employee, EmployeeDTO.class);
    }
}
