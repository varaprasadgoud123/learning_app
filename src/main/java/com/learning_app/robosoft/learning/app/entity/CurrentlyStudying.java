package com.learning_app.robosoft.learning.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "currently_studying")
public class CurrentlyStudying {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "sub_id")
    private String subId;

    @Column(name = "chapter_id")
    private String chapterId;

    @Column(name = "lesson_id")
    private String lessonId;

    @Column(name = "unit_id")
    private String unitId;

    public CurrentlyStudying(){

    }

    public CurrentlyStudying(String userId, String subId, String chapterId, String lessonId, String unitId) {
        this.userId = userId;
        this.subId = subId;
        this.chapterId = chapterId;
        this.lessonId = lessonId;
        this.unitId = unitId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    @Override
    public String toString() {
        return "CurrentlyStudying{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", subId='" + subId + '\'' +
                ", chapterId='" + chapterId + '\'' +
                ", lessonId='" + lessonId + '\'' +
                ", unitId='" + unitId + '\'' +
                '}';
    }
}
