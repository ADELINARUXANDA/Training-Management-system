package com.sda.trainingmanagementsystem.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ClassUnit")
public class ClassUnit {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @OneToMany
    private List<Classes> classesArrayList =new ArrayList<>();

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
    public List<Classes> getClassesArrayList() {
        return classesArrayList;
    }

    public void setClassesArrayList(List<Classes> classesArrayList) {
        this.classesArrayList = classesArrayList;
    }

}
