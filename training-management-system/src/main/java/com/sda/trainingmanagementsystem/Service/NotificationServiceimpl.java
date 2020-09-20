package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.NotificationDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;

import java.util.List;

public class NotificationServiceimpl implements NotificationService {
    @Override
    public List<NotificationDto> getNotifications() {
        return null;
    }

    @Override
    public NotificationDto findNotificationbyId(Long id) {
        return null;
    }

    @Override
    public void deleteNotification(Long id) {

    }

    @Override
    public void updateNotification(UserDto userDto) {

    }

    @Override
    public void addNotification(UserDto userDto) {

    }

    @Override
    public UserDto findNotificationByRead(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto findNotificationByUnRead(UserDto userDto) {
        return null;
    }
}
