package com.learning_app.robosoft.learning.app.service;

import com.learning_app.robosoft.learning.app.entity.Subject;

import java.util.List;

public interface SubjectServie {

    Subject save(Subject subject);

    void delete(int id);

    List<Subject> findAllSubjects();
}
