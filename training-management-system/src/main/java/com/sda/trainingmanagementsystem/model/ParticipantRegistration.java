package com.sda.trainingmanagementsystem.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ParticipantRegistration")

public class ParticipantRegistration {


    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date data;
    @OneToOne
    private User participant;
    @OneToOne
    private Course course;

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


    public User getParticipant() {
        return participant;
    }

    public void setParticipant(User participant) {
        this.participant = participant;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
