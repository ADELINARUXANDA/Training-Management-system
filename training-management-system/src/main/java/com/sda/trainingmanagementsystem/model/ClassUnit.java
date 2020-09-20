package com.sda.trainingmanagementsystem.model;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name="ClassUnit")
public class ClassUnit {
    private String name;

    @OneToMany
    private ArrayList<Classes> classesArrayList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
