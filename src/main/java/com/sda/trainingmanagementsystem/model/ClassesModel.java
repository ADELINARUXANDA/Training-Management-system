package com.sda.trainingmanagementsystem.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Classes")
public class ClassesModel {
  @Id
  @GeneratedValue
  private Long id;
    private String subject;
    @Temporal(TemporalType.DATE)
    private Date date;

    public String getSubject() {
        return subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
