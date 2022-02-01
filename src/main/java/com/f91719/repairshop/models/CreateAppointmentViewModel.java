package com.f91719.repairshop.models;

import com.f91719.repairshop.data.entity.RepairShop;
import com.f91719.repairshop.data.entity.Vehicle;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class CreateAppointmentViewModel {

    private String description;

//    @DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
//    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "YYYY-MM-ddTHH:mm:ss")
    private LocalDateTime date;


    private RepairShop repairShop;
    private Vehicle vehicle;

    private boolean completed = false;
}
