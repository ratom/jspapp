/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.custommvc1.serviceimpl;

import com.atom.cuatommvc1.dao.ProjectDAO;
import com.atom.cuatommvc1.entity.Project;
import com.atom.custommvc1.DAOImpl.ProjectDAOImpl;
import com.atom.custommvc1.service.ProjectService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rabin dulal
 */
public class ProjectServiceImpl implements ProjectService{
    private ProjectDAO projectDAO;
  public ProjectServiceImpl(){
     projectDAO =new ProjectDAOImpl( new ArrayList<>());
  }
    @Override
    public List<Project> getAll() {
        Date date=Calendar.getInstance().getTime();
        insert(new Project(1, "NOTENOTE", "a digital note keeping system", "a digital diary", date, null, true));
        insert(new Project(2, "M-LEARNING", "a digital learning syatem", "mobile learning", date, null, false));
        insert(new Project(3, "LOADSHEDDING", "a digital loadshedding displaying system", "android ;oadshedding app", date, null, true));
        insert(new Project(4, "MEET", "nepal telecom's social networking site", "good project", date, null, false));
        return projectDAO.getAll();
    }

    @Override
    public void insert(Project p) {
       projectDAO.insert(p);
    }
    
}
