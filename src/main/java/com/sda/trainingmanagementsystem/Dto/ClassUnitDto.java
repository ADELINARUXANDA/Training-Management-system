package com.sda.trainingmanagementsystem.Dto;

import com.sda.trainingmanagementsystem.model.ClassesModel;

import java.util.ArrayList;
import java.util.List;

public class ClassUnitDto {
    private Long id;
    private String name;
    private List<ClassesDto> classesArrayList =new ArrayList<>();

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

    public List<ClassesDto> getClassesArrayList() {
        return classesArrayList;
    }

    public void setClassesArrayList(List<ClassesDto> classesArrayList) {
        this.classesArrayList = classesArrayList;
    }
}
