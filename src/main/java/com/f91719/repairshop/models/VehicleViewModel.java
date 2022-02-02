package com.f91719.repairshop.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
public class VehicleViewModel {
    private long id;
    private String model;
    private String plateNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate manufactureDate;
}
