package myjavaservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = (String) request.getAttribute("name");
        int marks = (int) request.getAttribute("marks");

        String grade;
        if (marks >= 90) grade = "A";
        else if (marks >= 75) grade = "B";
        else if (marks >= 60) grade = "C";
        else grade = "F";

        out.println("<html><body>");
        out.println("<h2>Hello " + name + ", Your Grade is: " + grade + "</h2>");
        out.println("</body></html>");
    }
}
