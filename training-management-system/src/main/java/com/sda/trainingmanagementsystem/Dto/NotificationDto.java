package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.ClassesModel;
import com.sda.trainingmanagementsystem.model.UserModel;
import com.sda.trainingmanagementsystem.model.UserNotificationsModel;

import java.util.ArrayList;
import java.util.List;

public class NotificationDto {

    private Long id;
    private UserModel userGiven;
    private ArrayList<ClassesModel> classes;
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

    public ArrayList<ClassesModel> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<ClassesModel> classes) {
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
