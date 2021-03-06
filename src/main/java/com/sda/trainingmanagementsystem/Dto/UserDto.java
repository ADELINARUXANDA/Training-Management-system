package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.CourseModel;
import com.sda.trainingmanagementsystem.model.Type;
import com.sda.trainingmanagementsystem.model.UserNotificationsModel;

public class UserDto {

    private Long id;
    private String login;
    private String password;
    private Type type;
    private String first_name;
    private String last_name;
    private String active_status;
    private UserNotificationDto userNotificationsDto;
    private CourseDto course;

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

    public UserNotificationDto getUserNotificationsDto() {
        return userNotificationsDto;
    }

    public void setUserNotificationsDto(UserNotificationDto userNotificationsDto) {
        this.userNotificationsDto = userNotificationsDto;
    }

    public CourseDto getCourse() {
        return course;
    }

    public void setCourse(CourseDto course) {
        this.course = course;
    }
}