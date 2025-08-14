package myjavaservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String course = request.getParameter("course");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Registration Details</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("<p>Course: " + course + "</p>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>This servlet only accepts POST data from the form.</h3>");
    }
}
