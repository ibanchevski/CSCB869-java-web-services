package com.f91719.repairshop.models;

import com.f91719.repairshop.data.entity.RepairShop;
import com.f91719.repairshop.data.entity.User;
import com.f91719.repairshop.data.entity.Vehicle;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class CreateAppointmentViewModel {

    @NotBlank
    private String description;

    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private LocalDate date;


    private RepairShop repairShop;
    private Vehicle vehicle;

    private User client;

    private boolean completed = false;
}
