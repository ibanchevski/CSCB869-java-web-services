package com.f91719.repairshop.dto;

import com.f91719.repairshop.data.entity.Qualification;
import com.f91719.repairshop.data.entity.RepairShop;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeDTO {
    private long id;
    private String name;
    private Qualification qualification;
    private RepairShop repairShop;
}