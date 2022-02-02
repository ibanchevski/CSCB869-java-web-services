package com.f91719.repairshop.services.implementations;

import com.f91719.repairshop.data.entity.Vehicle;
import com.f91719.repairshop.data.repository.VehicleRepository;
import com.f91719.repairshop.dto.CreateVehicleDTO;
import com.f91719.repairshop.dto.VehicleDTO;
import com.f91719.repairshop.services.VehicleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return vehicleRepository
                .findAll()
                .stream()
                .map(this::mapToVehicleDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Vehicle createVehicle(CreateVehicleDTO vehicleDTO) {
        return vehicleRepository.save(modelMapper.map(vehicleDTO, Vehicle.class));
    }

    private VehicleDTO mapToVehicleDTO(Vehicle vehicle) {
        return modelMapper.map(vehicle, VehicleDTO.class);
    }
}
