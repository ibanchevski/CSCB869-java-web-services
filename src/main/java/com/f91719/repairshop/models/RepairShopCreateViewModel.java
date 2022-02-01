package com.f91719.repairshop.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class RepairShopCreateViewModel {
    @NotBlank
    @Size(min = 3, max = 100, message = "Shop name must be between 3 and 100 characters")
    private String name;

    @NotBlank
    @NotNull
    private String address;
}
