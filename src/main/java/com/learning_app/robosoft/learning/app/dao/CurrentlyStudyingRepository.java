package com.learning_app.robosoft.learning.app.dao;

import com.learning_app.robosoft.learning.app.entity.CurrentlyStudying;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurrentlyStudyingRepository extends JpaRepository<CurrentlyStudying, Integer> {

    List<CurrentlyStudying> findAllByUserId(String userId);
}
