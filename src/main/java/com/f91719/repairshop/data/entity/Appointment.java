package com.f91719.repairshop.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "appointment")
public class Appointment extends BaseEntity {
    private String description;

    @DateTimeFormat(pattern = "dd-MM-YYYY")
    private LocalDate date;

    @ManyToOne
    private RepairShop repairShop;

    @OneToOne
    private Vehicle vehicle;

    private boolean completed = false;
}
