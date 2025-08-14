package myjavaservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accno = request.getParameter("accno");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Dummy check
        if (accno.equals("12345") && password.equals("pass123")) {
            HttpSession session = request.getSession();
            session.setAttribute("name", "Navaneetha");
            session.setAttribute("balance", 7500);
            response.sendRedirect("balance");
        } else {
            out.println("<h3>Invalid account number or password!</h3>");
            out.println("<a href='accountLogin.html'>Try Again</a>");
        }
    }
}
//html file
//http://localhost:8080/Servlets/accountLogin.html
