package com.f91719.repairshop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class CreateVehicleDTO {
    private String model;
    private String plateNumber;
    private LocalDate manufactureDate;
}
