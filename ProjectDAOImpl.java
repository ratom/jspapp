/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.custommvc1.DAOImpl;

import com.atom.cuatommvc1.dao.ProjectDAO;
import com.atom.cuatommvc1.entity.Project;

import java.util.List;

/**
 *
 * @author rabin dulal
 */
public class ProjectDAOImpl implements ProjectDAO {
    private List<Project> ProjectList;
    public ProjectDAOImpl(List<Project> ProjectList){
        this.ProjectList=ProjectList;
    }
    @Override
    public List<Project> getAll() {
         return ProjectList;
    }

    @Override
    public void insert(Project p) {
         ProjectList.add(p);
    }
    
}
