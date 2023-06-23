package com.learning_app.robosoft.learning.app.rest;

import com.learning_app.robosoft.learning.app.entity.OtpEntity;
import com.learning_app.robosoft.learning.app.entity.User;
import com.learning_app.robosoft.learning.app.model.Login;
import com.learning_app.robosoft.learning.app.model.LoginSuccess;
import com.learning_app.robosoft.learning.app.model.OtpVerify;
import com.learning_app.robosoft.learning.app.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private UserService userService;

    public UserRestController(UserService theUserService){
        userService = theUserService;
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        User newUser = userService.save(user);
        return newUser;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @PostMapping("/login")
    public LoginSuccess login(@RequestBody OtpVerify otpVerify){

        OtpEntity otp = userService.getOtp(otpVerify.getUserId());
        User user = userService.findByUserId(otpVerify.getUserId());

        if(otpVerify.getOtp().equals(otp.getOtp())){
            LoginSuccess loginResponse = new LoginSuccess();
            loginResponse.setName(user.getName());
            loginResponse.setNotifications(10);
            return loginResponse;
        }else{
            throw new RuntimeException("User not found!");
        }
    }

    @PostMapping("/otp")
    public String otp(@RequestBody Login login){

        User user = userService.findByUserId(login.getId());

        if(login.getPassword().equals(user.getPassword())){
            Random random = new Random();
            OtpEntity otp = new OtpEntity();
            int randomNumber = 1000 + random.nextInt(9000);
            otp.setUserId(user.getUserId());
            otp.setOtp(String.valueOf(randomNumber));
            userService.generateOtp(otp);
            return "OTP has been sent to your email.";
        }else{
            throw new RuntimeException("User not found!");
        }
    }

    @GetMapping("/subjects")
    public List<String> subjects(){
        List<String> subjectsList = new ArrayList<>();
        subjectsList.add("Physics");
        subjectsList.add("Biology");
        subjectsList.add("Chemistry");
        subjectsList.add("Mathematics");
        subjectsList.add("Geography");
        subjectsList.add("Arts and Culture");

        return subjectsList;
    }
}
