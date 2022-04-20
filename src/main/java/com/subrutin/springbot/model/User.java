package com.subrutin.springbot.model;

public class User {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    private int id;
    private String name;
    private long amount;

    public User(int id, String name, long amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

//    public User findById(User user) {
//
////    }
}
