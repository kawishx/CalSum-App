/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kawishjayawardena
 */
public class CalServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        String num1Str = req.getParameter("num1");
        int num1 = Integer.parseInt(num1Str); //string to integer
        
        int num2 = Integer.parseInt(req.getParameter("num2"));
        
        int total = num1+num2;
        PrintWriter out = resp.getWriter();
        out.print("<h2>Total : "+total+"</h2>");
    }
      
    


     
    }

    
    
    

