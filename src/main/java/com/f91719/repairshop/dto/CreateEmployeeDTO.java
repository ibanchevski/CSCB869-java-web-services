package com.f91719.repairshop.dto;

import com.f91719.repairshop.data.entity.Qualification;
import com.f91719.repairshop.data.entity.RepairShop;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateEmployeeDTO {
    private String name;
    private Qualification qualification;
    private RepairShop repair_shop;
}
