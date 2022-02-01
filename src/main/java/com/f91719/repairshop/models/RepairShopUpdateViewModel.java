package com.f91719.repairshop.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RepairShopUpdateViewModel {
    @NotBlank
    private String name;

    private String address;
}
