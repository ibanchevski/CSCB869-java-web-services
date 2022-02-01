package com.f91719.repairshop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ShopAppointmentDTO {
    private long id;
    private String name;
    private String address;
}
