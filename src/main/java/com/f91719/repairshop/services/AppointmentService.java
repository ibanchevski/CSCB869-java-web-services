package com.f91719.repairshop.services;

import com.f91719.repairshop.data.entity.Appointment;
import com.f91719.repairshop.dto.AppointmentDTO;
import com.f91719.repairshop.dto.CreateAppointmentDTO;

import java.util.List;

public interface AppointmentService {
    List<AppointmentDTO> getAppointments();
    AppointmentDTO create(CreateAppointmentDTO appointmentDTO);
}
