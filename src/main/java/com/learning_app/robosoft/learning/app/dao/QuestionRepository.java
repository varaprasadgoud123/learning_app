package com.learning_app.robosoft.learning.app.dao;

import com.learning_app.robosoft.learning.app.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
