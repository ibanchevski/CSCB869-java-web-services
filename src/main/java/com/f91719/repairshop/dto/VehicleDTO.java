package com.f91719.repairshop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class VehicleDTO {
    private long id;
    private String model;

    @NotBlank
    private String plateNumber;

    @NotNull
    @DateTimeFormat(pattern = "yyyyy.MMMMM.dd GGG hh:mm aaa")
    private LocalDate manufactureDate;
}

