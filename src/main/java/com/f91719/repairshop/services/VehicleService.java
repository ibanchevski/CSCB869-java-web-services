package com.f91719.repairshop.services;

import com.f91719.repairshop.data.entity.Vehicle;
import com.f91719.repairshop.dto.CreateVehicleDTO;
import com.f91719.repairshop.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    List<VehicleDTO> getAllVehicles();
    Vehicle createVehicle(CreateVehicleDTO vehicleDTO);
}
