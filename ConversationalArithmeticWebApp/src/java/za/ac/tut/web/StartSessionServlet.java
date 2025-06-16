/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class StartSessionServlet extends HttpServlet {


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        
        String name = request.getParameter("name");
        
        initializeSession(session,name);
        
        RequestDispatcher disp = request.getRequestDispatcher("menu.jsp");
        disp.forward(request, response);
    }

    private void initializeSession(HttpSession session, String name) {
        Integer numQuestionAsked = 0, numCorrectAnswer = 0, numWrongAnswers = 0;
        
        session.setAttribute("numQuestionAsked", numQuestionAsked);
        session.setAttribute("numCorrectAnswer", numCorrectAnswer);
        session.setAttribute("numWrongAnswers", numWrongAnswers);
        session.setAttribute("name", name);
    }
}
