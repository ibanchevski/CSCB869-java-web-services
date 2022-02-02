package com.f91719.repairshop.controllers.view;

import com.f91719.repairshop.models.VehicleViewModel;
import com.f91719.repairshop.services.VehicleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
