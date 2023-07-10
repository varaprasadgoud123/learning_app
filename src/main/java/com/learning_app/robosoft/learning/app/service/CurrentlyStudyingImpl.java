package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.dao.CurrentlyStudyingRepository;
import com.learning_app.robosoft.learning.app.entity.CurrentlyStudying;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrentlyStudyingImpl implements CurrentlyStudyingService{

    private CurrentlyStudyingRepository currentlyStudyingRepository;

    @Autowired
    public CurrentlyStudyingImpl(CurrentlyStudyingRepository theCurrentlyStudyingRepository){
        currentlyStudyingRepository = theCurrentlyStudyingRepository;
    }
    @Override
    public CurrentlyStudying save(CurrentlyStudying currentlyStudying) {
        return currentlyStudyingRepository.save(currentlyStudying);
    }

    @Override
    public List<CurrentlyStudying> findAllByUserId(String userId) {
        return currentlyStudyingRepository.findAllByUserId(userId);
    }

}
