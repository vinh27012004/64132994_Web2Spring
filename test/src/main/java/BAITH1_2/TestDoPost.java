package BAITH1_2;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestDoPost extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Bài 1.2 - doPOST</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bài 1.2 - Ví dụ doPOST</h1>");
        out.println("<form method='POST'>");
        out.println("Nhập tên: <input type='text' name='name' required><br><br>");
        out.println("Nhập tuổi: <input type='number' name='age' required><br><br>");
        out.println("<input type='submit' value='Gửi'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Kết quả doPOST</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Kết quả nhận từ POST request</h1>");
        out.println("<p>Tên: " + name + "</p>");
        out.println("<p>Tuổi: " + age + "</p>");
        out.println("<a href='/test/testDoPost'>Quay lại</a>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
