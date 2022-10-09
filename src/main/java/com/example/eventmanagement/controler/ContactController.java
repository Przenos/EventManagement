package com.example.eventmanagement.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ContactController {
    @GetMapping("/contact.html")
    public String getCourse() {
        return "contact";
    }
}
