package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.NotificationDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;

import java.util.List;

public interface NotificationService {

    List<NotificationDto> getNotifications();
    NotificationDto findNotificationbyId(Long id);
    void deleteNotification(Long id);
    void updateNotification(UserDto userDto);
    void addNotification(UserDto userDto);
    UserDto findNotificationByRead(UserDto userDto);
    UserDto findNotificationByUnRead(UserDto userDto);
}
