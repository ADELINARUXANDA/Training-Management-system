package com.sda.trainingmanagementsystem.model;


import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {

    private String name;
    private ClassUnit classUnit;
@OneToOne
private ParticipantRegistration participantRegistration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassUnit getClassUnit() {
        return classUnit;
    }

    public void setClassUnit(ClassUnit classUnit) {
        this.classUnit = classUnit;
    }
}
