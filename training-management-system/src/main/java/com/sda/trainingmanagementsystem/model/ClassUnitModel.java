package com.sda.trainingmanagementsystem.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ClassUnit")
public class ClassUnitModel {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @OneToMany
    private List<ClassesModel> classesArrayList =new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public List<ClassesModel> getClassesArrayList() {
        return classesArrayList;
    }

    public void setClassesArrayList(List<ClassesModel> classesArrayList) {
        this.classesArrayList = classesArrayList;
    }

}
