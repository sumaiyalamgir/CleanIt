package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminController {

    @GetMapping("/admin-login")
    public String adminLoginForm() {
        return "adminlogin"; // Assuming your HTML file is named "admin-login.html"
    }

    @PostMapping("/admin-login")
    public String adminLogin(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
        // Add your authentication logic here
        if (username.equals("admin") && password.equals("admin123")) {
            redirectAttributes.addFlashAttribute("message", "Login successful!");
            return "admin-dashboard"; // Redirect to the admin dashboard
        }
        redirectAttributes.addFlashAttribute("error", "Invalid username or password");
        return "redirect:/admin-login";
    }
    @GetMapping("/admin-dashboard")
    public String admindashboard(){
        return "admin-dashboard";
    }
}
