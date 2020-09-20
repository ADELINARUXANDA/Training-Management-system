package com.sda.trainingmanagementsystem.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AccountsTeachers")

public class Teachers {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
