package com.learning_app.robosoft.learning.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "name")
    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "lesson_text")
    private  String lessonText;

    public Lesson(){}

    public Lesson(int subjectId, String name, String imageUrl, String lessonText) {
        this.subjectId = subjectId;
        this.name = name;
        this.imageUrl = imageUrl;
        this.lessonText = lessonText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLessonText() {
        return lessonText;
    }

    public void setLessonText(String lessonText) {
        this.lessonText = lessonText;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", subjectId=" + subjectId +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", lessonText='" + lessonText + '\'' +
                '}';
    }
}
