package com.f91719.repairshop.services.implementations;

import com.f91719.repairshop.data.entity.Appointment;
import com.f91719.repairshop.data.repository.AppointmentRepository;
import com.f91719.repairshop.dto.AppointmentDTO;
import com.f91719.repairshop.dto.CreateAppointmentDTO;
import com.f91719.repairshop.services.AppointmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private final ModelMapper modelMapper;
    private final AppointmentRepository appointmentRepository;

    @Override
    public List<AppointmentDTO> getAppointments() {
        return appointmentRepository
                .findAll()
                .stream()
                .map(this::convertToAppointmentDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AppointmentDTO create(CreateAppointmentDTO appointmentDTO) {
        return convertToAppointmentDTO(
                appointmentRepository.save(modelMapper.map(appointmentDTO, Appointment.class))
        );
    }

    private AppointmentDTO convertToAppointmentDTO(Appointment appointment) {
        return modelMapper.map(appointment, AppointmentDTO.class);
    }
}
