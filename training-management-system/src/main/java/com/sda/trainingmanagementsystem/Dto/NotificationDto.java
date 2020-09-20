package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.Classes;
import com.sda.trainingmanagementsystem.model.User;
import com.sda.trainingmanagementsystem.model.UserNotifications;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

public class NotificationDto {

    private Long id;
    private User userGiven;
    private ArrayList<Classes> classes;
    private List<UserNotifications> notificationsArrayList = new ArrayList<>();
    private String subject;
    private String contents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserGiven() {
        return userGiven;
    }

    public void setUserGiven(User userGiven) {
        this.userGiven = userGiven;
    }

    public ArrayList<Classes> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Classes> classes) {
        this.classes = classes;
    }

    public List<UserNotifications> getNotificationsArrayList() {
        return notificationsArrayList;
    }

    public void setNotificationsArrayList(List<UserNotifications> notificationsArrayList) {
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
