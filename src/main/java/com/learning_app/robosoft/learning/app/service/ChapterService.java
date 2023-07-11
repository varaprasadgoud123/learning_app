package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.entity.Chapter;

import java.util.List;

public interface ChapterService {

    Chapter save(Chapter chapter);

    void delete(int id);

    List<Chapter> viewAll();

    //List<Chapter> findBySubjectId(int id);
}
