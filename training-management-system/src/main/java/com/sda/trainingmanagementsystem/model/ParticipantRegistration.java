package com.sda.trainingmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="ParticipantRegistration")

public class ParticipantRegistration {

    private Date data;
    private Participant User_participant;
    private Course course;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }


    public Participant getUser_participant() {
        return User_participant;
    }

    public void setUser_participant(Participant user_participant) {
        User_participant = user_participant;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
