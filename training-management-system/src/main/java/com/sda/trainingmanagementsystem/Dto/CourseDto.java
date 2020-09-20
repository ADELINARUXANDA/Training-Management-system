package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.ClassUnit;
import com.sda.trainingmanagementsystem.model.ParticipantRegistration;

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

    public List<ClassUnit> getClassUnits() {
        return classUnits;
    }

    public void setClassUnits(List<ClassUnit> classUnits) {
        this.classUnits = classUnits;
    }

    public ParticipantRegistration getParticipantRegistration() {
        return participantRegistration;
    }

    public void setParticipantRegistration(ParticipantRegistration participantRegistration) {
        this.participantRegistration = participantRegistration;
    }

    private String name;
    private List<ClassUnit> classUnits = new ArrayList<>();
    private ParticipantRegistration participantRegistration;

}
