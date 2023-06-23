package com.learning_app.robosoft.learning.app.model;

public class OtpVerify {
    private String otp;
    private String userId;

    public OtpVerify(){

    }

    public OtpVerify(String otp, String userId) {
        this.otp = otp;
        this.userId = userId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OtpVerify{" +
                "otp='" + otp + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
