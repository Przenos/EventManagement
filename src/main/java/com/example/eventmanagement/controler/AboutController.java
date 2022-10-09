package com.example.eventmanagement.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AboutController {

    @GetMapping("/about.html")
    public String getCourse() {
        return "about";
    }
}
