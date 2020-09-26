package com.sda.trainingmanagementsystem.model;


import com.sda.trainingmanagementsystem.Dto.ClassUnitDto;
import com.sda.trainingmanagementsystem.Dto.ParticipantRegistrationDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Course")
public class CourseModel {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<ClassUnitModel> classUnits = new ArrayList<>();
    @OneToOne
    private ParticipantRegistrationModel participantRegistration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClassUnitDto> getClassUnits() {
        return classUnits;
    }

    public void setClassUnits(List<ClassUnitModel> classUnits) {
        this.classUnits = classUnits;
    }

    public ParticipantRegistrationDto getParticipantRegistration() {
        return participantRegistration;
    }

    public void setParticipantRegistration(ParticipantRegistrationModel participantRegistration) {
        this.participantRegistration = participantRegistration;
    }
}