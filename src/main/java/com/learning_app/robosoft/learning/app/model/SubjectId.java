package com.learning_app.robosoft.learning.app.model;

import com.learning_app.robosoft.learning.app.entity.Subject;

public class SubjectId {
    private int SubjectId;

    public SubjectId(){}

    public SubjectId(int subjectId) {
        SubjectId = subjectId;
    }

    public int getSubjectId() {
        return SubjectId;
    }

    @Override
    public String toString() {
        return "SubjectId{" +
                "SubjectId=" + SubjectId +
                '}';
    }
}
