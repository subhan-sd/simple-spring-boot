package com.subrutin.springbot.services;


import com.subrutin.springbot.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class UserServices {

    @Autowired
    private User dataUser;

    private static HashMap<Long , User> listUser = new HashMap<>();
    static {
        User user1 = new User(1,"ACE",100);
        listUser.put(1L,user1);
    }

    public static List<User> getAllUsersData(){
        return new ArrayList<>(listUser.values());
    }

    public static User getUser(int id){
        return listUser.get(id);
    }

}
