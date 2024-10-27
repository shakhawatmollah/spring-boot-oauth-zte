package com.shakhawat.springbootoauthzte;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(HttpServletRequest request, Model model, String error, String logout) {
        if(error != null) {
            model.addAttribute("error", true);
            model.addAttribute("errorMessage", "Invalid username and password!");
        }
        if(logout != null) {
            model.addAttribute("message", "You have been logged out successfully.");
        }
        return "pages/login";
    }

    @GetMapping("/")
    public String home() {
        return "pages/home";
    }
}
