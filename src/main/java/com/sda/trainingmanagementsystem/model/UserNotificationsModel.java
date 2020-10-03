package com.sda.trainingmanagementsystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="UserNotification")
public class UserNotificationsModel<Arraylist> {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    private List<NotificationModel> readNotifications = new ArrayList<>();
    @OneToMany
    private List<NotificationModel> unreadNotifications = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<NotificationModel> getReadNotifications() {
        return readNotifications;
    }

    public void setReadNotifications(List<NotificationModel> readNotifications) {
        this.readNotifications = readNotifications;
    }

    public List<NotificationModel> getUnreadNotifications() {
        return unreadNotifications;
    }

    public void setUnreadNotifications(List<NotificationModel> unreadNotifications) {
        this.unreadNotifications = unreadNotifications;
    }
}
