package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.NotificationModel;

import java.util.ArrayList;
import java.util.List;

public class UserNotificationDto {
    private Long id;
    private List<NotificationDto> readNotificationsDto = new ArrayList<>();
    private List<NotificationDto> unreadNotifications = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<NotificationDto> getReadNotificationsDto() {
        return readNotificationsDto;
    }

    public void setReadNotificationsDto(List<NotificationDto> readNotificationsDto) {
        this.readNotificationsDto = readNotificationsDto;
    }

    public List<NotificationDto> getUnreadNotifications() {
        return unreadNotifications;
    }

    public void setUnreadNotifications(List<NotificationDto> unreadNotifications) {
        this.unreadNotifications = unreadNotifications;
    }
}

