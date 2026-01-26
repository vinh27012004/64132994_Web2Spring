package BAITH1_1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestDoGet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Bài 1.1 - doGET</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bài 1.1 - Ví dụ doGET</h1>");
        out.println("<p>Đây là phản hồi từ phương thức doGet</p>");
        out.println("<p>Client gửi GET request đến servlet</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
