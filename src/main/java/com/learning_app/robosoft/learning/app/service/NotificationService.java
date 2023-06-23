package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.entity.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> findAllByUserId(String userId);

    Notification save(Notification notification);

    List<Notification> findAll();
}
