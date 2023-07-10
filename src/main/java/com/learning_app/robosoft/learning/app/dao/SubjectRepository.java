package com.learning_app.robosoft.learning.app.dao;

import com.learning_app.robosoft.learning.app.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
