package com.sda.trainingmanagementsystem.model;


import javax.persistence.*;

@Entity
@Table(name = "User")
public class UserModel {
    @Id
    @GeneratedValue
    private Long id;
    private String login;
    private String password;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public UserNotificationsModel getUserNotifications() {
        return userNotifications;
    }

    public void setUserNotifications(UserNotificationsModel userNotifications) {
        this.userNotifications = userNotifications;
    }

    public CourseModel getCourse() {
        return course;
    }

    public void setCourse(CourseModel course) {
        this.course = course;
    }

    @Enumerated(EnumType.STRING)
    private Type type;
    private String first_name;
    private String last_name;
    private String active_status;
    @OneToOne
    private UserNotificationsModel userNotifications;
    @OneToOne
    private CourseModel course;

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
}
