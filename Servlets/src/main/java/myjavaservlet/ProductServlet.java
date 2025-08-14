package myjavaservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String item = request.getParameter("product");
        String[] parts = item.split("-"); // "Pen-10" → ["Pen", "10"]
        String name = parts[0];
        String price = parts[1];

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Enter Quantity for: " + name + "</h2>");
        out.println("<form action='order' method='post'>");
        out.println("<input type='hidden' name='pname' value='" + name + "'>");
        out.println("<input type='hidden' name='pprice' value='" + price + "'>");
        out.println("Quantity: <input type='number' name='quantity'><br><br>");
        out.println("<input type='submit' value='Place Order'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
