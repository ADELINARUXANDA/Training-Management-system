package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.ClassesModel;
import com.sda.trainingmanagementsystem.model.UserModel;
import com.sda.trainingmanagementsystem.model.UserNotificationsModel;

import java.util.ArrayList;
import java.util.List;

public class NotificationDto {

    private Long id;
    private UserDto userGiven;
    private ArrayList<ClassesDto> classes;
    private List<UserNotificationDto> notificationsArrayListDto = new ArrayList<>();
    private String subject;
    private String contents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setNotificationsArrayListDto(List<UserNotificationDto> notificationsArrayListDto) {
        this.notificationsArrayListDto = notificationsArrayListDto;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
