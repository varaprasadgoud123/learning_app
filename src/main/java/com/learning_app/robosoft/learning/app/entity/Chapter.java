package com.learning_app.robosoft.learning.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chapters")
public class Chapter {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "chapter")
    private String chapter;

    @Column(name = "subject_id")
    private int subjectId;

    public Chapter(){}

    public Chapter(String chapter, int subjectId) {
        this.chapter = chapter;
        this.subjectId = subjectId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", chapter='" + chapter + '\'' +
                ", subjectId=" + subjectId +
                '}';
    }
}
