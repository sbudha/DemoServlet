package com.sanjeev;

import javax.servlet.RequestDispatcher;
import java.io.IOException;

/**
 * Created by Sanjeev on 9/9/2014.
 */
public class HelloWorld extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        float P = Float.parseFloat(request.getParameter("P"));
        float T = Float.parseFloat(request.getParameter("T"));
        float R = Float.parseFloat(request.getParameter("R"));

        float I = (P * T * R)/100;

        request.setAttribute("P",P);
        request.setAttribute("T",T);
        request.setAttribute("R",R);
        request.setAttribute("I",I);

        RequestDispatcher view = request.getRequestDispatcher("output.jsp");
        view.forward(request, response);

    }
}
