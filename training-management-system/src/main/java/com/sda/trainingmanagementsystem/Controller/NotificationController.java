package com.sda.trainingmanagementsystem.Controller;

import com.sda.trainingmanagementsystem.Dto.ClassesDto;
import com.sda.trainingmanagementsystem.Dto.CourseDto;
import com.sda.trainingmanagementsystem.Dto.NotificationDto;
import com.sda.trainingmanagementsystem.Service.CourseService;
import com.sda.trainingmanagementsystem.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping("findNotificatioms")
    public ResponseEntity<List<ClassesDto>> getNotifications() {
        List<NotificationDto> notificationDtoList = notificationService.getNotifications();
        return new ResponseEntity(notificationDtoList, HttpStatus.OK);
    }

    @DeleteMapping("deleteNotification/{id}")
    public ResponseEntity deleteNotification(@PathVariable("id") Long id) {
        String message = notificationService.deleteNotification(id);
        return new ResponseEntity(message, HttpStatus.OK);
    }

    @PostMapping("addNotification")
    public ResponseEntity addClassUnit(@RequestBody NotificationDto notificationDto) {
        notificationService.addNotification(notificationDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("getNotification/{id}")
    public ResponseEntity<ClassesDto> findNotificationbyId(@PathVariable("id") Long id) {
        NotificationDto notificationDto = notificationService.findNotificationbyId(id);
        return new ResponseEntity(notificationDto, HttpStatus.OK);

    }

    @PutMapping("editNotification")
    public ResponseEntity updateNotification(@RequestBody NotificationDto notificationDto) {
        notificationService.updateNotification(notificationDto);
        return new ResponseEntity(HttpStatus.OK);
    }
}
