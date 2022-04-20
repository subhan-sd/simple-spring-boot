package com.subrutin.springbot.controllers;

import com.subrutin.springbot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping("/getUser")
    public List<User> getAllUser(){return getAllUser();}

//

}
