package com.learning_app.robosoft.learning.app.dao;

import com.learning_app.robosoft.learning.app.entity.OtpEntity;
import com.learning_app.robosoft.learning.app.model.LoginSuccess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtpRepository extends JpaRepository<OtpEntity, String> {
    OtpEntity findByUserId(String userId);
}
