package com.f91719.repairshop.controllers.view;

import com.f91719.repairshop.data.entity.Vehicle;
import com.f91719.repairshop.dto.CreateVehicleDTO;
import com.f91719.repairshop.dto.VehicleDTO;
import com.f91719.repairshop.models.CreateVehicleViewModel;
import com.f91719.repairshop.models.VehicleViewModel;
import com.f91719.repairshop.services.VehicleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
@RequestMapping("/vehicles")
public class VehicleViewController {
    private final VehicleService vehicleService;
    private final ModelMapper modelMapper;

    @GetMapping
    public String getVehiclesView(Model model) {
        // TODO: probably remove
        List<VehicleViewModel> vehicles = vehicleService.getAllVehicles()
                .stream()
                .map(v -> modelMapper.map(v, VehicleViewModel.class))
                .collect(Collectors.toList());

        model.addAttribute("vehicles", vehicles);
        return "/vehicles/vehicles";
    }

    @GetMapping("/create")
    public String getCreateView(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "/vehicles/create";
    }

    @PostMapping("/create")
    public String createVehicle(@ModelAttribute("vehicle")CreateVehicleViewModel vehicle) {
        vehicleService.createVehicle(
                modelMapper.map(vehicle, CreateVehicleDTO.class)
        );
        return "redirect:/vehicles";
    }
}
