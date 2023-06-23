package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.dao.OtpRepository;
import com.learning_app.robosoft.learning.app.dao.UserRespository;
import com.learning_app.robosoft.learning.app.entity.OtpEntity;
import com.learning_app.robosoft.learning.app.entity.User;
import com.learning_app.robosoft.learning.app.model.LoginSuccess;
import com.learning_app.robosoft.learning.app.model.OtpVerify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    private UserRespository userRespository;
    private OtpRepository otpRepository;

    @Autowired
    public UserServiceImpl(UserRespository theUserRespository, OtpRepository theOtpRepository){
        userRespository = theUserRespository;
        otpRepository = theOtpRepository;
    }

    @Override
    public List<User> findAll() {
        return userRespository.findAll();
    }

    @Override
    public User save(User user){
        return userRespository.save(user);
    }

    @Override
    public User findByUserId(String userId) {
        return userRespository.findByUserId(userId);
    }

    @Override
    public User updateUser(User user) {
        User tempUser = userRespository.findByUserId(user.getUserId());
        tempUser.setName(user.getName());
        tempUser.setUserId(user.getUserId());
        return userRespository.save(tempUser);
    }

    @Override
    public OtpEntity generateOtp(OtpEntity otpEntity) {
        return otpRepository.save(otpEntity);
    }

    @Override
    public OtpEntity getOtp(String userId) {
        return  otpRepository.findByUserId(userId);
    }

//    @Override
//    public LoginSuccess verifyOtp(OtpVerify otp) {
//        System.out.println(otp.getUserId());
//        return otpRepository.findByUserId(otp.getUserId());
//    }

}
