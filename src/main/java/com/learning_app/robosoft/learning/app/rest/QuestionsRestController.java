package com.learning_app.robosoft.learning.app.rest;

import com.learning_app.robosoft.learning.app.entity.Question;
import com.learning_app.robosoft.learning.app.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionsRestController {

    private QuestionService questionService;

    public QuestionsRestController(QuestionService theQuestionService){
        questionService = theQuestionService;
    }

    @PostMapping("/questions")
    public Question createQuestion(@RequestBody Question question){
        return questionService.createQuestion(question);
    }

    @GetMapping("/questions/{id}")
    public Question findquestion(@PathVariable Integer id){
        return  questionService.findById(id);
    }

    @GetMapping("/questions")
    public List<Question> findAll(){
        return  questionService.findAll();
    }

}
