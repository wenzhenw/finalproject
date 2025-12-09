package ca.sheridancollege.wenzh.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "index.html";  // Not a Thymeleaf template!
    }
}