package com.subrutin.springbot.services;


import com.subrutin.springbot.model.User;
import com.subrutin.springbot.model.UserInfo;
import com.subrutin.springbot.model.UserReq;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static ch.qos.logback.core.joran.action.ActionConst.NULL;

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

    public static User dropUser(Integer id) {
        listUser.remove(id);
        return listUser.get(id);
    }

    public static User UserMinuseAmount(int id, long amount,UserReq userReq) {

        userReq.setId(id);
        userReq.setAmountReq(amount);
//        User inputUser = new User(id, listUser.get(id).getName(),(listUser.get(id).getAmount() - amount));
//        listUser.put(id, inputUser);
//        ceck(amount,id);
//        return listUser.get(id);

        if (listUser.get(id).getAmount() < amount){
            return new UserInfo("error","stock tidak mencukupi", new User(id,listUser.get(id).getName(),listUser.get(id).getAmount()));

        }
        listUser.put(id, new User(id,listUser.get(id).getName(),listUser.get(id).getAmount() - amount));
        return new UserInfo("success", "Stock berhasil dikurangi", listUser.get(id));


    }

    public static void ceck(long amount,int id){
        try {
            if( listUser.get(id).getAmount() >amount){
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");}
        }
        catch(Exception e) {
            System.out.println("Can't divide a number by 0");
        }
    }


    public static User UserPlusAmount(int id, long amount,UserReq userReq) {

        userReq.setId(id);
        userReq.setAmountReq(amount);

        User inputUser = new User(id, listUser.get(id).getName(),(listUser.get(id).getAmount() + amount));
        listUser.put(id, inputUser);
        return listUser.get(id);

    }

    public static User Createuser(int id , String name, long amount){
        User user = new User(id,name,amount);
        listUser.put(id,user);
        return listUser.get(id);

    }



}
