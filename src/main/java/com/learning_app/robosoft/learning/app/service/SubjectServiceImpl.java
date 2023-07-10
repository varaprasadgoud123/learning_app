package com.learning_app.robosoft.learning.app.service;


import com.learning_app.robosoft.learning.app.dao.SubjectRepository;
import com.learning_app.robosoft.learning.app.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectServie{

    private SubjectRepository subjectRepository;

    @Autowired
    public SubjectServiceImpl(SubjectRepository theSubjectRepository){
        subjectRepository = theSubjectRepository;
    }


    @Override
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void delete(int id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public List<Subject> findAllSubjects() {
        return subjectRepository.findAll();
    }
}
