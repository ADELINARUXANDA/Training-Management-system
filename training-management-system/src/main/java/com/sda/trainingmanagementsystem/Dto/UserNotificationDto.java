package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.NotificationModel;

import java.util.ArrayList;
import java.util.List;

public class UserNotificationDto {
    private Long id;
    private List<NotificationModel> readNotifications = new ArrayList<>();
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
