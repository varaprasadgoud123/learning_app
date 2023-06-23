package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.entity.Lesson;

import java.util.List;

public interface LessonService {

    Lesson save(Lesson lesson);

    List<Lesson> findAllBySubjectId(int subjectId);

    Lesson findLesson(int lessonId);
}
