package com.sda.trainingmanagementsystem.model;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "Course")
public class Course {

    private String name;
    @OneToMany

    private ArrayList<ClassUnit> classUnits;
    @OneToOne
    private ParticipantRegistration participantRegistration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ClassUnit> getClassUnits() {
        return classUnits;
    }

    public void setClassUnits(ArrayList<ClassUnit> classUnits) {
        this.classUnits = classUnits;
    }
}