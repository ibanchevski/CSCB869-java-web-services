package com.f91719.repairshop.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "repair_shop")
public class RepairShop extends BaseEntity {
    private String name;
    private String address;

    @OneToMany(mappedBy = "repair_shop")
    @JsonIgnoreProperties("repair_shop")
    private List<Employee> employees;
}