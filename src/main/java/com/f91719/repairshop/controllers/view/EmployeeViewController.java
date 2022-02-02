package com.f91719.repairshop.controllers.view;

import com.f91719.repairshop.data.entity.Employee;
import com.f91719.repairshop.data.entity.Qualification;
import com.f91719.repairshop.models.CreateEmployeeViewModel;
import com.f91719.repairshop.services.EmployeeService;
import com.f91719.repairshop.services.RepairShopService;
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
    private final RepairShopService repairShopService;

    @GetMapping
    public String employeesView(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "/employees/index";
    }

    @GetMapping("/create")
    public String getCreateView(Model model) {
        model.addAttribute("employee", new CreateEmployeeViewModel());
        model.addAttribute("qualifications", Qualification.values());
        model.addAttribute("repairShops", repairShopService.getAll());
        return "/employees/create";
    }
}
