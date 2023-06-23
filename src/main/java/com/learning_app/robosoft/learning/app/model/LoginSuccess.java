package com.learning_app.robosoft.learning.app.model;

import java.util.ArrayList;

public class LoginSuccess {

    private String name;

    private int notifications;

    private ArrayList<String> currently_studying;

    public LoginSuccess(){}

    public LoginSuccess(String name, int notifications, ArrayList<String> currently_studying) {
        this.name = name;
        this.notifications = notifications;
        this.currently_studying = currently_studying;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNotifications() {
        return notifications;
    }

    public void setNotifications(int notifications) {
        this.notifications = notifications;
    }

    public ArrayList<String> getCurrently_studying() {
        return currently_studying;
    }

    public void setCurrently_studying(ArrayList<String> currently_studying) {
        this.currently_studying = currently_studying;
    }

    @Override
    public String toString() {
        return "LoginSuccess{" +
                "name='" + name + '\'' +
                ", notifications=" + notifications +
                ", currently_studying=" + currently_studying +
                '}';
    }
}
