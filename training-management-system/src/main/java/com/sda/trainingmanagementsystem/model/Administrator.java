package com.sda.trainingmanagementsystem.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Administrator")
public class Administrator {
    private String name;
}