package com.sda.trainingmanagementsystem.Service;

import com.sda.trainingmanagementsystem.Dto.NotificationDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;
import com.sda.trainingmanagementsystem.Repository.NotificationRepository;
import com.sda.trainingmanagementsystem.model.NotificationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NotificationServiceimpl implements NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public List<NotificationDto> getNotifications() {
        List<NotificationModel> notificationModels = notificationRepository.findAll();
        List<NotificationDto> notificationDtoList = new ArrayList<>();

        for (NotificationModel notificationModel : notificationModels) {
            NotificationDto notificationDto = new NotificationDto();
            notificationDto.setId(notificationModel.getId());
            notificationDto.setContents(notificationModel.getContents());
            notificationDto.setSubject(notificationModel.getSubject());
            notificationDtoList.add(notificationDto);
        }
        return notificationDtoList;
    }

    @Override
    public NotificationDto findNotificationbyId(Long id) {
        Optional<NotificationModel> optionalNotificationModel = notificationRepository.findById(id);
        if (optionalNotificationModel.isPresent()) {
            NotificationModel notificationModelFind = optionalNotificationModel.get();
            NotificationDto notificationDto = new NotificationDto();
            notificationDto.setId(notificationModelFind.getId());
            notificationDto.setSubject(notificationModelFind.getSubject());
            notificationDto.setContents(notificationModelFind.getContents());

            return notificationDto;

        }
        return null;
    }

    @Override
    public String deleteNotification(Long id) {
        notificationRepository.deleteById(id);
        return null;
    }

    @Override
    public void updateNotification(NotificationDto notificationDto) {
        Optional<NotificationModel> notificationModel = notificationRepository.findById(notificationDto.getId());
        if (notificationModel.isPresent()) {

            NotificationModel notificationModelFind = notificationModel.get();
            notificationModelFind.setId(notificationDto.getId());
            notificationModelFind.setContents(notificationDto.getContents());
            notificationModelFind.setSubject(notificationDto.getSubject());
            notificationRepository.save(notificationModelFind);

        }
    }

    @Override
    public void addNotification(NotificationDto notificationDto) {
        NotificationModel notificationModel = new NotificationModel();
        notificationModel.setId(notificationDto.getId());
        notificationModel.setSubject(notificationDto.getSubject());
        notificationModel.setContents(notificationDto.getContents());
        notificationRepository.save(notificationModel);
    }

    @Override
    public UserDto findNotificationByRead(NotificationDto notificationDto) {
        return null;
    }

    @Override
    public UserDto findNotificationByUnRead(NotificationDto notificationDto) {
        return null;
    }

}
