package com.sda.trainingmanagementsystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="UserNotification")
public class UserNotifications<Arraylist> {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    private List<Notification> readNotifications = new ArrayList<>();
    @OneToMany
    private List<Notification> unreadNotifications = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Notification> getReadNotifications() {
        return readNotifications;
    }

    public void setReadNotifications(List<Notification> readNotifications) {
        this.readNotifications = readNotifications;
    }

    public List<Notification> getUnreadNotifications() {
        return unreadNotifications;
    }

    public void setUnreadNotifications(List<Notification> unreadNotifications) {
        this.unreadNotifications = unreadNotifications;
    }
}
