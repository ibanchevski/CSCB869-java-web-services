package com.f91719.repairshop.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "appointment")
public class Appointment extends BaseEntity {
    private String description;

    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private LocalDate date;

    @ManyToOne
    private RepairShop repairShop;

    @OneToOne
    private Vehicle vehicle;

    @OneToOne
    private User client;

    private boolean completed = false;
}
