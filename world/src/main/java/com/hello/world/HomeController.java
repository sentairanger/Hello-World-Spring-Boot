package com.hello.world;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage() {
       return "home";
    }

    @GetMapping("/on")
    public String turnOn() {
        System.out.println("on");
        return "home";
    }

    @GetMapping("/off")
    public String turnOff() {
        System.out.print("Off");
        return "home";
    }
}
