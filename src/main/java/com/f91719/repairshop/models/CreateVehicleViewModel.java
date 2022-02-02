package com.f91719.repairshop.models;

import com.f91719.repairshop.data.entity.Qualification;
import com.f91719.repairshop.data.entity.RepairShop;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class CreateVehicleViewModel {
    @NotBlank
    private String model;

    @NotBlank
    private String plateNumber;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate manufactureDate;
}
