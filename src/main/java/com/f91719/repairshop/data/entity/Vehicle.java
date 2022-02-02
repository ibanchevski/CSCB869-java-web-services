package com.f91719.repairshop.data.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "vehicle")
public class Vehicle extends BaseEntity {
    private String model;

    @NotBlank
    private String plateNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate manufactureDate;
}
