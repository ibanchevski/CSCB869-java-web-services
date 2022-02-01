package com.f91719.repairshop.models;

import com.f91719.repairshop.data.entity.Qualification;
import com.f91719.repairshop.data.entity.RepairShop;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class CreateEmployeeViewModel {
    @NotBlank
    @Size(min = 5, max = 50)
    private String name;

    @NotNull
    private Qualification qualification;

    @NotNull
    private RepairShop repair_shop;
}
