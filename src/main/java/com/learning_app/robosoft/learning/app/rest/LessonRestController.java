package com.learning_app.robosoft.learning.app.rest;

import com.learning_app.robosoft.learning.app.entity.Lesson;
import com.learning_app.robosoft.learning.app.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LessonRestController {

    private LessonService lessonService;

    public LessonRestController(LessonService theLessonService){
        lessonService = theLessonService;
    }

    @PostMapping("/lessons")
    public Lesson createLesson(@RequestBody Lesson lesson){
        return lessonService.save(lesson);
    }

    @GetMapping("/subject/{subjectId}")
    public List<Lesson> findAllLessons(@PathVariable Integer subjectId){
        return lessonService.findAllBySubjectId(subjectId);
    }

    @GetMapping("lessons/{lessonId}")
    public Lesson findALesson(@PathVariable Integer lessonId){
        return  lessonService.findLesson(lessonId);
    }

}
