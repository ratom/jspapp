/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.cuatommvc1.entity;

import java.util.Date;

/**
 *
 * @author rabin dulal
 */
public class Project {
   private int id;
   private String name, description,remarks;
   private Date startedDate,endDate;
   private Boolean status;

    public Project() {
    }

    public Project(int id, String name, String description, String remarks, Date startedDate, Date endDate, Boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.remarks = remarks;
        this.startedDate = startedDate;
        this.endDate = endDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
   
   
}
