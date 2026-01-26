package BAITH1_3;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutMe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Bài 1.3 - Thông tin về tôi</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 40px; }");
        out.println(".info { background-color: #f0f0f0; padding: 20px; border-radius: 5px; }");
        out.println("h1 { color: #333; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Thông tin cá nhân</h1>");
        out.println("<div class='info'>");
        out.println("<p><strong>Họ và tên:</strong> Phạm Văn Vinh</p>");
        out.println("<p><strong>Ngày sinh:</strong> 15/05/1999</p>");
        out.println("<p><strong>Địa chỉ:</strong> Hà Nội, Việt Nam</p>");
        out.println("<p><strong>Ngành học:</strong> Công nghệ thông tin</p>");
        out.println("<p><strong>Sở thích:</strong> Lập trình Java, Web Development, Công nghệ mới</p>");
        out.println("<p><strong>Kỹ năng:</strong> Java, JSP, Servlet, HTML, CSS, SQL</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
