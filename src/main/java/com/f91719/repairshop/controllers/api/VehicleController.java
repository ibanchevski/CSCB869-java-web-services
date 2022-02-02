package com.f91719.repairshop.controllers.api;


import com.f91719.repairshop.data.entity.Vehicle;
import com.f91719.repairshop.dto.CreateVehicleDTO;
import com.f91719.repairshop.dto.VehicleDTO;
import com.f91719.repairshop.models.CreateVehicleViewModel;
import com.f91719.repairshop.services.VehicleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;
    private final ModelMapper modelMapper;

    @GetMapping
    public List<VehicleDTO> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @PostMapping
    public Vehicle createVehicle(@RequestBody @Valid CreateVehicleViewModel vehicleViewModel) {
        return vehicleService.createVehicle(modelMapper.map(vehicleViewModel, CreateVehicleDTO.class));
    }
}
