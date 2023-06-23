package com.learning_app.robosoft.learning.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "otp")
public class OtpEntity {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "otp")
    private String otp;

    public OtpEntity(){

    }

    public OtpEntity(String userId, String otp) {
        this.userId = userId;
        this.otp = otp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    @Override
    public String toString() {
        return "Otp{" +
                "userId='" + userId + '\'' +
                ", otp='" + otp + '\'' +
                '}';
    }
}
