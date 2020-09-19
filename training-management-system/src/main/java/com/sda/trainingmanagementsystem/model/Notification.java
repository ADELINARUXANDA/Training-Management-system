package com.sda.trainingmanagementsystem.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="Notification")
public class Notification {

    private Classes classes;
    private String subject;
    private String contents;

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
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
