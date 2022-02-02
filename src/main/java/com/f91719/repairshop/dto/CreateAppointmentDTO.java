package com.f91719.repairshop.dto;

import com.f91719.repairshop.data.entity.RepairShop;
import com.f91719.repairshop.data.entity.Vehicle;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CreateAppointmentDTO {
    private String description;

    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private LocalDate date;

    @ManyToOne
    private RepairShop repairShop;

    @OneToOne
    private Vehicle vehicle;

    private boolean completed = false;
}
