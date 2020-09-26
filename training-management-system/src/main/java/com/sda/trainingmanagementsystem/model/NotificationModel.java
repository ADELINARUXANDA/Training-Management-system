package com.sda.trainingmanagementsystem.model;


import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Dto.UserNotificationDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="Notification")
public class NotificationModel {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private UserModel userGiven;

    @OneToMany
    private List<ClassesModel> classes = new ArrayList<>();
    @OneToMany
    private List<UserNotificationsModel> notificationsArrayList = new ArrayList<>();
    private String subject;
    private String contents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserModel getUserGiven() {
        return userGiven;
    }

    public void setUserGiven(UserModel userGiven) {
        this.userGiven = userGiven;
    }

    public List<ClassesModel> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassesModel> classes) {
        this.classes = classes;
    }

    public List<UserNotificationsModel> getNotificationsArrayList() {
        return notificationsArrayList;
    }

    public void setNotificationsArrayList(List<UserNotificationsModel> notificationsArrayList) {
        this.notificationsArrayList = notificationsArrayList;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}