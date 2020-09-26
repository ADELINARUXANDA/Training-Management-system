package com.sda.trainingmanagementsystem.model;

import com.sda.trainingmanagementsystem.Dto.CourseDto;
import com.sda.trainingmanagementsystem.Dto.UserDto;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ParticipantRegistration")

public class ParticipantRegistrationModel {


    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date data;
    @OneToOne
    private UserModel participant;
    @OneToOne
    private CourseModel course;

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

    public void setParticipant(UserModel participant) {
        this.participant = participant;
    }

    public CourseModel getCourse() {
        return course;
    }

    public void setCourse(CourseModel course) {
        this.course = course;
    }
}