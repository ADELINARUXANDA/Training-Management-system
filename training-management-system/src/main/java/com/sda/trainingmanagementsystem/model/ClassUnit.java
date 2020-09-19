package com.sda.trainingmanagementsystem.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ClassUnit")
public class ClassUnit {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
