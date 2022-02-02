package com.f91719.repairshop.controllers.view;

import com.f91719.repairshop.data.entity.Appointment;
import com.f91719.repairshop.data.entity.User;
import com.f91719.repairshop.dto.CreateAppointmentDTO;
import com.f91719.repairshop.models.CreateAppointmentViewModel;
import com.f91719.repairshop.services.AppointmentService;
import com.f91719.repairshop.services.RepairShopService;
import com.f91719.repairshop.services.VehicleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
@RequestMapping("/appointments")
public class AppointmentViewController {
    private final AppointmentService appointmentService;
    private final RepairShopService repairShopService;
    private final VehicleService vehicleService;
    private final ModelMapper modelMapper;

    @GetMapping
    public String getAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.getAppointments());
        return "/appointments/appointments";
    }

    @GetMapping("/create/{id}")
    public String showCreateView(Model model, @PathVariable long id) {
        model.addAttribute("shop", repairShopService.getRepairShopById(id));
        model.addAttribute("appointment", new Appointment());
        model.addAttribute("vehicles", vehicleService.getAllVehicles());
        return "/appointments/create";
    }

    @PostMapping("/create/{id}")
    public String createAppointment(Authentication authentication, @PathVariable long id, @ModelAttribute("appointment") CreateAppointmentViewModel appointmentViewModel) {
        User client = (User) authentication.getPrincipal();
        appointmentViewModel.setClient(client);
        appointmentViewModel.setRepairShop(repairShopService.getRepairShopById(id));

        appointmentService.create(
                modelMapper.map(appointmentViewModel, CreateAppointmentDTO.class)
        );
        return "redirect:/appointments";
    }
}
