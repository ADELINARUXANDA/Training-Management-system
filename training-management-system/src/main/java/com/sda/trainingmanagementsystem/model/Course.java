package com.sda.trainingmanagementsystem.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany

    private List<ClassUnit> classUnits = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ParticipantRegistration getParticipantRegistration() {
        return participantRegistration;
    }

    public void setParticipantRegistration(ParticipantRegistration participantRegistration) {
        this.participantRegistration = participantRegistration;
    }

    @OneToOne
    private ParticipantRegistration participantRegistration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClassUnit> getClassUnits() {
        return classUnits;
    }

    public void setClassUnits(List<ClassUnit> classUnits) {
        this.classUnits = classUnits;
    }
}