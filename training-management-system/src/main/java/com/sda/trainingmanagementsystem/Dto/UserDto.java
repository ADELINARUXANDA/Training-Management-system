package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.Course;
import com.sda.trainingmanagementsystem.model.Type;
import com.sda.trainingmanagementsystem.model.UserNotifications;

import javax.persistence.OneToOne;

public class UserDto {

    private Long id;
    private String login;
    private String password;
    private Type type;
    private String first_name;
    private String last_name;
    private String active_status;
    private UserNotifications userNotifications;
    private Course course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getActive_status() {
        return active_status;
    }

    public void setActive_status(String active_status) {
        this.active_status = active_status;
    }

    public UserNotifications getUserNotifications() {
        return userNotifications;
    }

    public void setUserNotifications(UserNotifications userNotifications) {
        this.userNotifications = userNotifications;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
