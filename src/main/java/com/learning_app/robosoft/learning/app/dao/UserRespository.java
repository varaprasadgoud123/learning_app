package com.learning_app.robosoft.learning.app.dao;

import com.learning_app.robosoft.learning.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Integer> {

    User findByUserId(String userId);
}
