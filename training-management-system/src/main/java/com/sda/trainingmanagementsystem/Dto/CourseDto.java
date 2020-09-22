package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.ClassUnitModel;
import com.sda.trainingmanagementsystem.model.ParticipantRegistrationModel;

import java.util.ArrayList;
import java.util.List;

public class CourseDto {
    private Long id;

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

    public List<ClassUnitModel> getClassUnits() {
        return classUnits;
    }

    public void setClassUnits(List<ClassUnitModel> classUnits) {
        this.classUnits = classUnits;
    }

    public ParticipantRegistrationModel getParticipantRegistration() {
        return participantRegistration;
    }

    public void setParticipantRegistration(ParticipantRegistrationModel participantRegistration) {
        this.participantRegistration = participantRegistration;
    }

    private String name;
    private List<ClassUnitModel> classUnits = new ArrayList<>();
    private ParticipantRegistrationModel participantRegistration;

}
