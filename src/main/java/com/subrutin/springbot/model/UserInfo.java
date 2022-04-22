package com.subrutin.springbot.model;

public class UserInfo {
    String error;
    String stock_tidak_mencukupi;
    User user;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getStock_tidak_mencukupi() {
        return stock_tidak_mencukupi;
    }

    public void setStock_tidak_mencukupi(String stock_tidak_mencukupi) {
        this.stock_tidak_mencukupi = stock_tidak_mencukupi;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserInfo(String error, String stock_tidak_mencukupi, User user) {
        this.error = error;
        this.stock_tidak_mencukupi = stock_tidak_mencukupi;
        this.user = user;
    }
}
