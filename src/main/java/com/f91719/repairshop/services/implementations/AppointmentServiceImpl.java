package com.f91719.repairshop.services.implementations;

import com.f91719.repairshop.data.entity.Appointment;
import com.f91719.repairshop.data.repository.AppointmentRepository;
import com.f91719.repairshop.dto.CreateAppointmentDTO;
import com.f91719.repairshop.services.AppointmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private final ModelMapper modelMapper;
    private final AppointmentRepository appointmentRepository;

    @Override
    public Appointment create(CreateAppointmentDTO appointmentDTO) {
        return appointmentRepository.save(modelMapper.map(appointmentDTO, Appointment.class));
    }
}
