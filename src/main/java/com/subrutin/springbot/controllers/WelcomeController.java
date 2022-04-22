package com.subrutin.springbot.controllers;

import com.subrutin.springbot.model.User;
import com.subrutin.springbot.model.UserReq;
import com.subrutin.springbot.services.UserServices;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import javax.validation.Valid;
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

    @PostMapping("/dropUser/{id}")
    public User dropUser(@PathVariable Integer id) {
        return UserServices.dropUser(id);
    }

    @PostMapping(value = "/newUser")
    public User postNewUser(@Valid @RequestBody User user, Errors errors) {
        if (user.getId() == 0){
//            for (ObjectError error: errors.getAllErrors()) {
//                System.out.println(error.getDefaultMessage());
//            }
            System.out.println("System Error : Id can't be Null");
            throw new RuntimeException("Validation Error !!!!!!!!!!");
        }else {
            return UserServices.Createuser(user.getId(), user.getName(), user.getAmount());
        }
    }

    @PostMapping(value = "/reduceAmount")
    public User getMinuseAmount(@RequestBody UserReq userReq) {
        return UserServices.UserMinuseAmount(userReq.getId(), userReq.getAmountReq(), userReq);
    }

    @PostMapping(value = "/plusAmount")
    public User getPlusAmount(@RequestBody UserReq userReq) {
        return UserServices.UserPlusAmount(userReq.getId(), userReq.getAmountReq(), userReq);
    }


//

}
