package com.f91719.repairshop.models;

import com.f91719.repairshop.data.entity.RepairShop;
import com.f91719.repairshop.data.entity.Vehicle;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
public class CreateAppointmentViewModel {
    @Size(min = 5, max = 200)
    private String description;

    @NotNull
    @DateTimeFormat(pattern = "dd-MM-YYYY")
    private LocalDate date;

    private RepairShop repairShop;

    private Vehicle vehicle;

    private boolean completed = false;
}
