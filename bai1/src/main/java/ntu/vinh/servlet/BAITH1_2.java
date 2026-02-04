package ntu.vinh.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BAITH1_1/testDoGet")
public class BAITH1_2 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>BAITH1_2 - Test DoPost</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 50px; }");
            out.println("h1 { color: #2c3e50; }");
            out.println("form { margin-top: 20px; }");
            out.println("input[type='text'] { padding: 8px; margin: 5px 0; width: 200px; }");
            out.println("input[type='submit'] { padding: 10px 20px; background: #3498db; color: white; border: none; cursor: pointer; }");
            out.println("input[type='submit']:hover { background: #2980b9; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>BAITH1_2 - Test DoPost Method</h1>");
            out.println("<form method='post' action='testDoPost'>");
            out.println("<label>Tên của bạn:</label><br>");
            out.println("<input type='text' name='name' placeholder='Nhập tên...' required><br><br>");
            out.println("<label>Email:</label><br>");
            out.println("<input type='text' name='email' placeholder='Nhập email...' required><br><br>");
            out.println("<input type='submit' value='Gửi'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>BAITH1_2 - Kết quả</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 50px; }");
            out.println("h1 { color: #27ae60; }");
            out.println(".result { background: #ecf0f1; padding: 20px; border-radius: 5px; }");
            out.println("a { color: #3498db; text-decoration: none; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Dữ liệu đã nhận (POST Method)</h1>");
            out.println("<div class='result'>");
            out.println("<p><strong>Tên:</strong> " + (name != null ? name : "N/A") + "</p>");
            out.println("<p><strong>Email:</strong> " + (email != null ? email : "N/A") + "</p>");
            out.println("</div>");
            out.println("<br><a href='testDoPost'>← Quay lại</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
