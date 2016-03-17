/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.custommvc1.service;

import com.atom.cuatommvc1.entity.Project;
import java.util.List;

/**
 *
 * @author rabin dulal
 */
public interface ProjectService {
     List<Project> getAll();
    void insert(Project p);
}
