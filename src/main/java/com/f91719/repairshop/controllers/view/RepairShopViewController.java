package com.f91719.repairshop.controllers.view;

import com.f91719.repairshop.data.entity.Employee;
import com.f91719.repairshop.data.entity.Qualification;
import com.f91719.repairshop.data.entity.RepairShop;
import com.f91719.repairshop.dto.CreateEmployeeDTO;
import com.f91719.repairshop.dto.RepairShopCreateDTO;
import com.f91719.repairshop.dto.RepairShopDTO;
import com.f91719.repairshop.dto.RepairShopUpdateDTO;
import com.f91719.repairshop.models.CreateEmployeeViewModel;
import com.f91719.repairshop.models.RepairShopCreateViewModel;
import com.f91719.repairshop.models.RepairShopViewModel;
import com.f91719.repairshop.services.EmployeeService;
import com.f91719.repairshop.services.RepairShopService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Controller
@RequestMapping("/repair-shops")
public class RepairShopViewController {
    private final RepairShopService repairShopService;
    private final EmployeeService employeeService;
    private final ModelMapper modelMapper;

    @GetMapping
    public String showRepairShops(Model model) {
        final List<RepairShopViewModel> repairShops = repairShopService
                .getAll()
                .stream()
                .map(this::convertToRepairShopViewModel)
                .collect(Collectors.toList());

        model.addAttribute("repairShops", repairShops);
        return "/repair-shops/repair-shops";
    }

    @GetMapping("/create")
    public String showCreateShopForm(Model model) {
        model.addAttribute("repairShop", new RepairShopCreateViewModel());
        return "/repair-shops/create";
    }

    @PostMapping("/create")
    public String createShop(@ModelAttribute RepairShop repairShop) {
        repairShopService.create(modelMapper.map(repairShop, RepairShopCreateDTO.class));
        return "redirect:/repair-shops/repair-shops";
    }

    @GetMapping("/update/{id}")
    public String updateRepairShopForm(@PathVariable long id, Model model) {
        model.addAttribute("repairShop", repairShopService.getRepairShopById(id));
        return "/repair-shops/update";
    }

    @PostMapping("/update/{id}")
    public String updateRepairShop(@PathVariable long id, @ModelAttribute RepairShop repairShop) {
        repairShopService.update(id, modelMapper.map(repairShop, RepairShopUpdateDTO.class));
        return "redirect:/";
    }

    @GetMapping("/{id}/employees/new")
    public String showCreateEmployeeView(Model model, @PathVariable long id) {
        List<RepairShop> repairShops = new ArrayList<>();
        repairShops.add(repairShopService.getRepairShopById(id));

        model.addAttribute("shopId", id);
        model.addAttribute("employee", new Employee());
        model.addAttribute("qualifications", Qualification.values());
        model.addAttribute("repairShops", repairShops);
        return "/employees/create";
    }

    @PostMapping("/{id}/employees/new")
    public String showCreateEmployeeView(@PathVariable long id, @Valid @ModelAttribute("employee") CreateEmployeeViewModel employee) {
        employee.setRepair_shop(repairShopService.getRepairShopById(id));
        employeeService.create(modelMapper.map(employee, CreateEmployeeDTO.class));
        return "redirect:/repair-shops";
    }

    private RepairShopViewModel convertToRepairShopViewModel(RepairShopDTO repairShopDTO) {
        return modelMapper.map(repairShopDTO, RepairShopViewModel.class);
    }
}
