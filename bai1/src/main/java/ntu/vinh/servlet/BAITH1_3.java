package ntu.vinh.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BAITH1_3/AboutMe")
public class BAITH1_3 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>BAITH1_3 - About Me</title>");
            out.println("<style>");
            out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; padding: 0; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); }");
            out.println(".container { max-width: 600px; margin: 50px auto; background: white; padding: 40px; border-radius: 10px; box-shadow: 0 10px 30px rgba(0,0,0,0.3); }");
            out.println("h1 { color: #667eea; text-align: center; margin-bottom: 30px; }");
            out.println(".info { margin: 20px 0; }");
            out.println(".info-item { display: flex; padding: 15px; margin: 10px 0; background: #f8f9fa; border-left: 4px solid #667eea; border-radius: 5px; }");
            out.println(".info-label { font-weight: bold; width: 150px; color: #495057; }");
            out.println(".info-value { color: #212529; }");
            out.println(".avatar { text-align: center; margin-bottom: 30px; }");
            out.println(".avatar-circle { width: 120px; height: 120px; border-radius: 50%; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); margin: 0 auto; display: flex; align-items: center; justify-content: center; color: white; font-size: 48px; font-weight: bold; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<div class='avatar'>");
            out.println("<div class='avatar-circle'>NV</div>");
            out.println("</div>");
            out.println("<h1>Thông Tin Cá Nhân</h1>");
            out.println("<div class='info'>");
            out.println("<div class='info-item'>");
            out.println("<div class='info-label'>Họ và tên:</div>");
            out.println("<div class='info-value'>Nguyễn Văn A</div>");
            out.println("</div>");
            out.println("<div class='info-item'>");
            out.println("<div class='info-label'>MSSV:</div>");
            out.println("<div class='info-value'>64132994</div>");
            out.println("</div>");
            out.println("<div class='info-item'>");
            out.println("<div class='info-label'>Lớp:</div>");
            out.println("<div class='info-value'>64.CNTT-1</div>");
            out.println("</div>");
            out.println("<div class='info-item'>");
            out.println("<div class='info-label'>Khoa:</div>");
            out.println("<div class='info-value'>Công nghệ thông tin</div>");
            out.println("</div>");
            out.println("<div class='info-item'>");
            out.println("<div class='info-label'>Email:</div>");
            out.println("<div class='info-value'>nguyenvana@ntu.edu.vn</div>");
            out.println("</div>");
            out.println("<div class='info-item'>");
            out.println("<div class='info-label'>Sở thích:</div>");
            out.println("<div class='info-value'>Lập trình, Đọc sách, Du lịch</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
