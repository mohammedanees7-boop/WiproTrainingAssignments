package myjavaservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BalanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false); // Don't create a new session

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (session != null && session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            int balance = (Integer) session.getAttribute("balance");

            out.println("<h2>Welcome, " + name + "</h2>");
            out.println("<p>Your balance is: ₹" + balance + "</p>");
            out.println("<a href='logout'>Logout</a>");
        } else {
            out.println("<h3>Session expired. Please <a href='accountLogin.html'>login again</a>.</h3>");
        }
    }
}
//http://localhost:8080/Servlets/balance
//http://localhost:8080/Servlets/accountLogin.html
//http://localhost:8080/Servlets/login
