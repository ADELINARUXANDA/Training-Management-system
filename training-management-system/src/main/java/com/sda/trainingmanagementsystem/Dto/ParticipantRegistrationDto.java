package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.CourseModel;
import com.sda.trainingmanagementsystem.model.UserModel;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class ParticipantRegistrationDto {

    private Long id;
    @Temporal(TemporalType.DATE)
    private Date data;
    private UserModel participant;
    private CourseModel course;
}
