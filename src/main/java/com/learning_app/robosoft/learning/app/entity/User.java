package com.learning_app.robosoft.learning.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "password")
    private String password;

    public User(){

    }

    public User(String name, String userId, String password) {
        this.name = name;
        this.userId = userId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
