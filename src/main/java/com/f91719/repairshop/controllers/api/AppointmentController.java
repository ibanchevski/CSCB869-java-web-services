package com.f91719.repairshop.controllers.api;

import com.f91719.repairshop.data.entity.Appointment;
import com.f91719.repairshop.dto.CreateAppointmentDTO;
import com.f91719.repairshop.models.CreateAppointmentViewModel;
import com.f91719.repairshop.services.AppointmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {
    private final ModelMapper modelMapper;
    private final AppointmentService appointmentService;

    @PostMapping
    public Appointment createAppointment(@RequestBody CreateAppointmentViewModel appointment) {
        return appointmentService.create(modelMapper.map(appointment, CreateAppointmentDTO.class));
    }
}
