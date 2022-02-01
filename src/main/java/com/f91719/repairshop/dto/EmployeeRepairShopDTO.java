package com.f91719.repairshop.dto;

import com.f91719.repairshop.data.entity.Qualification;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmployeeRepairShopDTO {
    private long id;
    private String name;
    private Qualification qualification;
    private String repairShop;
}