package com.sda.trainingmanagementsystem.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="Notification")
public class Notification {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private User userGiven;

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

    public List<UserNotifications> getNotificationsArrayList() {
        return notificationsArrayList;
    }

    public void setNotificationsArrayList(List<UserNotifications> notificationsArrayList) {
        this.notificationsArrayList = notificationsArrayList;
    }

    @OneToMany
    private ArrayList<Classes> classes;
    @OneToMany
    private List<UserNotifications> notificationsArrayList = new ArrayList<>();
    private String subject;
    private String contents;

    public ArrayList<Classes> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Classes> classes) {
        this.classes = classes;
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