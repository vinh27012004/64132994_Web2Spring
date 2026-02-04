package ntu.vinh.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BAITH1_1/testDoGet")
public class BAITH1_1 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>BAITH1_1 - Test DoGet</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 50px; }");
            out.println("h1 { color: #2c3e50; }");
            out.println("p { font-size: 16px; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>BAITH1_1 - Test DoGet Method</h1>");
            out.println("<p>Đây là servlet sử dụng phương thức <strong>doGet()</strong></p>");
            out.println("<p>URL: <code>/testDoGet</code></p>");
            out.println("<p>Method: <strong>GET</strong></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
