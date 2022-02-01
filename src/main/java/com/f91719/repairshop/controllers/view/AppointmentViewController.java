package com.f91719.repairshop.controllers.view;

import com.f91719.repairshop.services.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/appointments")
public class AppointmentViewController {
    private final AppointmentService appointmentService;

    @GetMapping
    public String getAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.getAppointments());
        return "/appointments/appointments";
    }
}
