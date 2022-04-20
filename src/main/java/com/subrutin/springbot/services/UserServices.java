package com.subrutin.springbot.services;


import com.subrutin.springbot.model.User;
import com.subrutin.springbot.model.UserReq;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserServices {

    @Autowired
    private User dataUser;
    private static HashMap<Integer, User> listUser = new HashMap<>();

    static {
        User user1 = new User(1, "ACE", 100);
        User user2 = new User(2, "BDF", 200);
        User user3 = new User(3, "CEG", 300);
        listUser.put(1, user1);
        listUser.put(2, user2);
        listUser.put(3, user3);
    }

    public static List<User> getAllUsersData() {
        return new ArrayList<>(listUser.values());
    }

    public static User getUser(Integer id) {
        return listUser.get(id);
    }

    public static User UserMinuseAmount(int id, long amount,UserReq userReq) {

        userReq.setId(id);
        userReq.setAmountReq(amount);

        User inputUser = new User(id, listUser.get(id).getName(),(listUser.get(id).getAmount() + amount));
        listUser.put(id, inputUser);
        return listUser.get(id);

    }




}
