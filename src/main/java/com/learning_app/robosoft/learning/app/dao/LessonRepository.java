package com.learning_app.robosoft.learning.app.dao;

import com.learning_app.robosoft.learning.app.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
    List<Lesson> findBySubjectId(int subjectId);
}
