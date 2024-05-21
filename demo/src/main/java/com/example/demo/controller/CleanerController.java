package com.example.demo.controller;

import com.example.demo.entity.Cleaner;
import com.example.demo.service.CleanerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CleanerController {

    @Autowired
    private CleanerService cleanerService;

    @GetMapping("/add-cleaner")
    public String showAddCleanerForm(Model model) {
        model.addAttribute("cleaner", new Cleaner());
        return "add-cleaner";
    }

    @PostMapping("/api/cleaners")
    public String addCleaner(@ModelAttribute Cleaner cleaner, Model model) {
        Cleaner savedCleaner = cleanerService.addCleaner(cleaner);
        model.addAttribute("message", "Cleaner added successfully!");
        return "add-cleaner";
    }
    @GetMapping("/cleaners")
    public String viewCleaners(Model model) {
        // Retrieve the list of cleaners from the service
        List<Cleaner> cleaners = cleanerService.getAllCleaners();

        // Add the list of cleaners to the model
        model.addAttribute("cleaners", cleaners);

        // Return the Thymeleaf template to display the list of cleaners
        return "cleanerlist";
    }
}
