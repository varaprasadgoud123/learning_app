package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.entity.Question;

import java.util.List;

public interface QuestionService {
    Question createQuestion(Question question);

    List<Question> findAll();

    Question findById(int id);
}
