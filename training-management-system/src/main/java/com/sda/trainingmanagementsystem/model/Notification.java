package com.sda.trainingmanagementsystem.model;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table (name="Notification")
public class Notification {

    @OneToOne
    private User userGiven;

    @OneToMany
    private ArrayList<Classes> classes;
    @OneToMany
    private ArrayList<UserNotifications> notificationsArrayList;
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
