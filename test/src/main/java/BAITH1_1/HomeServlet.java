package BAITH1_1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("    <meta charset='UTF-8'>");
        out.println("    <title>Trang chủ - Các bài tập Servlet</title>");
        out.println("    <style>");
        out.println("        body { font-family: Arial, sans-serif; margin: 40px; }");
        out.println("        h1 { color: #333; }");
        out.println("        .menu { list-style: none; padding: 0; }");
        out.println("        .menu li { margin: 15px 0; }");
        out.println("        .menu a { ");
        out.println("            display: inline-block;");
        out.println("            padding: 10px 20px;");
        out.println("            background-color: #4CAF50;");
        out.println("            color: white;");
        out.println("            text-decoration: none;");
        out.println("            border-radius: 5px;");
        out.println("            transition: background-color 0.3s;");
        out.println("        }");
        out.println("        .menu a:hover { background-color: #45a049; }");
        out.println("        .description { color: #666; margin-left: 20px; font-size: 14px; }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Các bài tập Servlet</h1>");
        out.println("<ul class='menu'>");
        out.println("    <li>");
        out.println("        <a href='/test/BAITH1_1/testDoGet'>Bài 1.1 - testDoGet</a>");
        out.println("        <div class='description'>Ví dụ xử lý GET request</div>");
        out.println("    </li>");
        out.println("    <li>");
        out.println("        <a href='/test/BAITH1_2/testDoPost'>Bài 1.2 - testDoPost</a>");
        out.println("        <div class='description'>Ví dụ xử lý POST request, nhập tên và tuổi</div>");
        out.println("    </li>");
        out.println("    <li>");
        out.println("        <a href='/test/BAITH1_3/AboutMe'>Bài 1.3 - AboutMe</a>");
        out.println("        <div class='description'>Hiển thị thông tin cá nhân</div>");
        out.println("    </li>");
        out.println("    <li>");
        out.println("        <a href='/test/BAITH1_4/BMI'>Bài 1.4 - BMI</a>");
        out.println("        <div class='description'>Tính chỉ số BMI (Body Mass Index)</div>");
        out.println("    </li>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
