package com.f91719.repairshop.data.repository;

import com.f91719.repairshop.data.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
