package com.subrutin.springbot.controllers;

import com.subrutin.springbot.model.User;
import com.subrutin.springbot.model.UserReq;
import com.subrutin.springbot.services.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping("/getUser")
    public List<User> getAllUser() {
        return UserServices.getAllUsersData();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Integer id) {
        return UserServices.getUser(id);
    }

    @PostMapping("/getUserByName")
    public User getMinuseAmount(@RequestBody UserReq userReq) {
        return UserServices.UserMinuseAmount(userReq.getId(), userReq.getAmountReq(), userReq);
    }

//

}
