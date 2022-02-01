package com.f91719.repairshop.models;

import com.f91719.repairshop.data.entity.RepairShop;
import com.f91719.repairshop.data.entity.Vehicle;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class CreateAppointmentViewModel {

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    private RepairShop repairShop;
    private Vehicle vehicle;

    private boolean completed = false;
}
