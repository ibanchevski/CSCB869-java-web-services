package com.f91719.repairshop.controllers.view;

import com.f91719.repairshop.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/employees")
public class EmployeeViewController {
    private final EmployeeService employeeService;

    @GetMapping
    public String employeesView(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "/employees/index";
    }
}
