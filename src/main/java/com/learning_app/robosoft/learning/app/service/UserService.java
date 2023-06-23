package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.entity.OtpEntity;
import com.learning_app.robosoft.learning.app.entity.User;
import com.learning_app.robosoft.learning.app.model.LoginSuccess;
import com.learning_app.robosoft.learning.app.model.OtpVerify;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);

    User findByUserId(String userId);

    User updateUser(User user);

    OtpEntity generateOtp(OtpEntity otpEntity);

    OtpEntity getOtp(String userId);
}
