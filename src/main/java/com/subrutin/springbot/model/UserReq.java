package com.subrutin.springbot.model;

public class UserReq {
    int id;
    long amountReq;

    public UserReq(int id, long amountReq) {
        this.id = id;
        this.amountReq = amountReq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAmountReq() {
        return amountReq;
    }

    public void setAmountReq(long amountReq) {
        this.amountReq = amountReq;
    }
}
