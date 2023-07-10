package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.entity.CurrentlyStudying;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CurrentlyStudyingService {

    CurrentlyStudying save(CurrentlyStudying currentlyStudying);

    List<CurrentlyStudying> findAllByUserId(String userId);
}
