package com.gearup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String HomeControllerHandler(){
        return "Booking" +
                " microservice for vehicle service station booking system";
    }

}
