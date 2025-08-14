package myjavaservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class UserRegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String profession = request.getParameter("profession");
        String married = request.getParameter("married") != null ? "Yes" : "No";
        String note = request.getParameter("note");

        out.println("<html><body>");
        out.println("<h2>Registration Details</h2>");
        out.println("<p><strong>Name:</strong> " + fullname + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Password:</strong> " + password + "</p>");
        out.println("<p><strong>Birthday:</strong> " + birthday + "</p>");
        out.println("<p><strong>Gender:</strong> " + gender + "</p>");
        out.println("<p><strong>Profession:</strong> " + profession + "</p>");
        out.println("<p><strong>Married:</strong> " + married + "</p>");
        out.println("<p><strong>Note:</strong> " + note + "</p>");
        out.println("</body></html>");
    }
}
