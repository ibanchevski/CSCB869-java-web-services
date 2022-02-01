package com.f91719.repairshop.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee extends BaseEntity {
    private String name;

    private Qualification qualification;

    @ManyToOne
    @JoinColumn(name = "repair_shop_id")
    private RepairShop repair_shop;

}
