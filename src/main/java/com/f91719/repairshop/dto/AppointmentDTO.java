package com.f91719.repairshop.dto;

import com.f91719.repairshop.data.entity.Vehicle;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class AppointmentDTO {
    private long id;
    private String description;
    private LocalDateTime date;
    private boolean completed;
    private Vehicle vehicle;
    private ShopAppointmentDTO repairShop;
}
