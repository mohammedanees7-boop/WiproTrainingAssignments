package myjavaservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("pname");
        int price = Integer.parseInt(request.getParameter("pprice"));
        int qty = Integer.parseInt(request.getParameter("quantity"));
        int total = price * qty;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Order Receipt</h2>");
        out.println("Product: " + name + "<br>");
        out.println("Price per unit: ₹" + price + "<br>");
        out.println("Quantity: " + qty + "<br>");
        out.println("<strong>Total: ₹" + total + "</strong>");
        out.println("</body></html>");
    }
}
