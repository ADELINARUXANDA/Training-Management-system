package com.sda.trainingmanagementsystem.Dto;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class ClassesDto {
    private Long id;
    private String subject;
    @Temporal(TemporalType.DATE)
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
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
