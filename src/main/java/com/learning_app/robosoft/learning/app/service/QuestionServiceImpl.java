package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.dao.QuestionRepository;
import com.learning_app.robosoft.learning.app.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService{

    QuestionRepository questionRepository;

    @Autowired
    public QuestionServiceImpl(QuestionRepository theQuestionRepository){
        questionRepository = theQuestionRepository;
    }

    @Override
    public Question createQuestion(Question question) {
        return (Question) questionRepository.save(question);
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findById(int id) {
        Optional<Question> question = questionRepository.findById(id);

        if(question.isPresent()){
            return question.get();
        }else{
            throw  new RuntimeException("No question was found with the give Id");
        }

    }


}
