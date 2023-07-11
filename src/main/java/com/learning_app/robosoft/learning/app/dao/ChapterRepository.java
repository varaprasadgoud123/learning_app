package com.learning_app.robosoft.learning.app.dao;

import com.learning_app.robosoft.learning.app.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChapterRepository extends JpaRepository<Chapter, Integer> {
    List<Chapter> findBySubjectId(int id);
}
