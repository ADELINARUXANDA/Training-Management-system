package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.Course;
import com.sda.trainingmanagementsystem.model.User;

import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class ParticipantRegistrationDto {

    private Long id;
    @Temporal(TemporalType.DATE)
    private Date data;
    private User participant;
    private Course course;
}
