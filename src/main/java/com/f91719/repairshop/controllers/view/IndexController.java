package com.f91719.repairshop.controllers.view;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String getIndex(Model model) {
        final String welcomeMessage = "Repair Shop welcome";
        model.addAttribute("welcome", welcomeMessage);
        return "index";
    }
}
