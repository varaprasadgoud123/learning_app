package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.dao.ChapterRepository;
import com.learning_app.robosoft.learning.app.entity.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService{

    private ChapterRepository chapterRepository;

    @Autowired
    public ChapterServiceImpl(ChapterRepository theChapterRepository){
        chapterRepository = theChapterRepository;
    }
    @Override
    public Chapter save(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    @Override
    public void delete(int id) {
        chapterRepository.deleteById(id);
    }

    @Override
    public List<Chapter> viewAll() {
        return chapterRepository.findAll();
    }

//    @Override
//    public List<Chapter> findBySubjectId(int id) {
//        return chapterRepository.findBySubjectId(id);
//    }
}
