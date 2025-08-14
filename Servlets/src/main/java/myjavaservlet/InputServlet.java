package myjavaservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InputServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        int marks = Integer.parseInt(request.getParameter("marks"));

        // Store in request scope
        request.setAttribute("name", name);
        request.setAttribute("marks", marks);

        // Forward to GradeServlet
        RequestDispatcher rd = request.getRequestDispatcher("grade");
        rd.forward(request, response);
    }
}
