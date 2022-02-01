package com.f91719.repairshop.services;

import com.f91719.repairshop.data.entity.Appointment;
import com.f91719.repairshop.dto.CreateAppointmentDTO;

public interface AppointmentService {
    Appointment create(CreateAppointmentDTO appointmentDTO);
}
