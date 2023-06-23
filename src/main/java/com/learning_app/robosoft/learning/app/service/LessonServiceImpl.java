package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.dao.LessonRepository;
import com.learning_app.robosoft.learning.app.entity.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonServiceImpl implements LessonService{

    private LessonRepository lessonRepository;

    @Autowired
    public LessonServiceImpl(LessonRepository theLessonRepository){
        lessonRepository = theLessonRepository;
    }

    @Override
    public Lesson save(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    @Override
    public List<Lesson> findAllBySubjectId(int subjectId) {
        return lessonRepository.findBySubjectId(subjectId);
    }

    @Override
    public Lesson findLesson(int lessonId) {
        Optional<Lesson> lesson = lessonRepository.findById(lessonId);

        if(lesson.isPresent()){
            return  lesson.get();
        }
        else{
            throw new RuntimeException("No lesson was found with the given Id");
        }
    }


}
