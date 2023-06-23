package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.dao.NotificationRepository;
import com.learning_app.robosoft.learning.app.dao.OtpRepository;
import com.learning_app.robosoft.learning.app.dao.UserRespository;
import com.learning_app.robosoft.learning.app.entity.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService{

    private NotificationRepository notificationRepository;

    @Autowired
    public NotificationServiceImpl(NotificationRepository theNotificationRepository){
        notificationRepository = theNotificationRepository;
    }

    @Override
    public List<Notification> findAllByUserId(String userId) {
        return notificationRepository.findByUserId(userId);
    }

    @Override
    public Notification save(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public List<Notification> findAll() {
        return  notificationRepository.findAll();
    }


}
