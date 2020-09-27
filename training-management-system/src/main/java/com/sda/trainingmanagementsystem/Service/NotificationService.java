package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.NotificationDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;

import java.util.List;

public interface NotificationService {

    List<NotificationDto> getNotifications();
    NotificationDto findNotificationbyId(Long id);
    String deleteNotification(Long id);
    void updateNotification(NotificationDto notificationDto);
    void addNotification(NotificationDto notificationDto);
    UserDto findNotificationByRead(NotificationDto notificationDto);
    UserDto findNotificationByUnRead(NotificationDto notificationDto);
}
