package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.ClassUnitModel;
import com.sda.trainingmanagementsystem.model.ParticipantRegistrationModel;

import java.util.ArrayList;
import java.util.List;

public class CourseDto {
    private Long id;
    private String name;
    private List<ClassUnitDto> classUnitsDto = new ArrayList<>();
    private ParticipantRegistrationDto participantRegistrationDto;

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

    public List<ClassUnitModel> getClassUnitsDto() {
        return classUnitsDto;
    }

    public void setClassUnitsDto(List<ClassUnitDto> classUnitsDto) {
        this.classUnitsDto = classUnitsDto;
    }

    public ParticipantRegistrationModel getParticipantRegistrationDto() {
        return participantRegistrationDto;
    }

    public void setParticipantRegistrationDto(ParticipantRegistrationDto participantRegistrationDto) {
        this.participantRegistrationDto = participantRegistrationDto;
    }
}