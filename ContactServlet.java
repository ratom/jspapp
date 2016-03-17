/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atom.custommvc1.servlet;

import com.atom.custommvc1.service.ProjectService;
import com.atom.custommvc1.serviceimpl.ProjectServiceImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rabin dulal
 */
@WebServlet(name = "contact",urlPatterns = {"/contact"} )
public class ContactServlet extends HttpServlet{
private ProjectService projectservice=new ProjectServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("projects", projectservice.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/contact.jsp");
        dispatcher.forward(req, resp);
    }
    
}
