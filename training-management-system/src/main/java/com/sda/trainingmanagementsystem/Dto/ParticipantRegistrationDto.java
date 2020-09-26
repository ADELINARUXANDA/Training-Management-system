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
    private UserDto participant;
    private CourseDto course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public UserModel getParticipant() {
        return participant;
    }

    public void setParticipant(UserDto participant) {
        this.participant = participant;
    }

    public CourseModel getCourse() {
        return course;
    }

    public void setCourse(CourseDto course) {
        this.course = course;
    }
}
