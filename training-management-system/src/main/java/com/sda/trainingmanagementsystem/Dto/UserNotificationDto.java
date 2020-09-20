package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.Notification;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class UserNotificationDto {
    private Long id;
    private List<Notification> readNotifications = new ArrayList<>();
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
