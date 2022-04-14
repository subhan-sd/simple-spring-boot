package com.subrutin.springbot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    public String welcome(){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("id", "123");
        capitalCities.put("name", "ABC");
        capitalCities.put("amount", "100");
        System.out.println(capitalCities);

        return "Test Dulu Error";
    };

//    @PostMapping
//    public String others(){
//        return "Another Data";
//    }
}
