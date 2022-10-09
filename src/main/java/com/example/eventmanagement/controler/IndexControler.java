package com.example.eventmanagement.controler;

import org.hibernate.mapping.Index;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControler {

        @GetMapping("/index.html")
        public String indexForm(Model model) {
                model.addAttribute("index", new Index());
                return "index";
        }


}
