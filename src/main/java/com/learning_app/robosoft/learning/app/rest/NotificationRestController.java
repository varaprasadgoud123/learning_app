package com.learning_app.robosoft.learning.app.rest;

import com.learning_app.robosoft.learning.app.entity.Notification;
import com.learning_app.robosoft.learning.app.service.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotificationRestController {
    private NotificationService notificationService;

    public NotificationRestController(NotificationService theUserService){
        notificationService = theUserService;
    }

    @PostMapping("/notifications")
    public Notification createNotification(@RequestBody Notification notification){
        return notificationService.save(notification);
    }

    @GetMapping("/notifications/{userId}")
    public List<Notification> notifications(@PathVariable String userId){
        System.out.println(userId);
        return notificationService.findAllByUserId(userId);
    }

    @GetMapping("/notifications")
    public List<Notification> getNotifications(){
        return notificationService.findAll();
    }
}
