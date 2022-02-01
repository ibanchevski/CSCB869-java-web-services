package com.f91719.repairshop.controllers.api;

import com.f91719.repairshop.data.entity.Appointment;
import com.f91719.repairshop.dto.AppointmentDTO;
import com.f91719.repairshop.dto.CreateAppointmentDTO;
import com.f91719.repairshop.models.CreateAppointmentViewModel;
import com.f91719.repairshop.services.AppointmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {
    private final ModelMapper modelMapper;
    private final AppointmentService appointmentService;

    @GetMapping
    public List<AppointmentDTO> getAllAppointments() {
        return appointmentService.getAppointments();
    }

    @PostMapping
    public AppointmentDTO createAppointment(@Valid @RequestBody CreateAppointmentViewModel appointment) {
        return appointmentService.create(modelMapper.map(appointment, CreateAppointmentDTO.class));
    }
}
