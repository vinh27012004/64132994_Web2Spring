package BAITH1_4;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BMI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Bài 1.4 - Tính chỉ số BMI</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 40px; }");
        out.println("form { background-color: #f0f0f0; padding: 20px; border-radius: 5px; width: 400px; }");
        out.println("input { padding: 8px; margin: 10px 0; width: 100%; box-sizing: border-box; }");
        out.println("input[type='submit'] { background-color: #4CAF50; color: white; cursor: pointer; }");
        out.println("input[type='submit']:hover { background-color: #45a049; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Tính chỉ số BMI</h1>");
        out.println("<form method='POST'>");
        out.println("<label>Chiều cao (cm):</label>");
        out.println("<input type='number' name='height' step='0.01' required>");
        out.println("<label>Cân nặng (kg):</label>");
        out.println("<input type='number' name='weight' step='0.01' required>");
        out.println("<input type='submit' value='Tính BMI'>");
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
        
        try {
            double height = Double.parseDouble(request.getParameter("height")); // cm
            double weight = Double.parseDouble(request.getParameter("weight")); // kg
            
            // Chuyển chiều cao từ cm sang m
            double heightInMeters = height / 100;
            
            // Tính BMI
            double bmi = weight / (heightInMeters * heightInMeters);
            
            // Phân loại BMI
            String classification = "";
            if (bmi < 18.5) {
                classification = "Gầy (Underweight)";
            } else if (bmi >= 18.5 && bmi < 25) {
                classification = "Bình thường (Normal weight)";
            } else if (bmi >= 25 && bmi < 30) {
                classification = "Thừa cân (Overweight)";
            } else {
                classification = "Béo phì (Obese)";
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Kết quả BMI</title>");
            out.println("<meta charset='UTF-8'>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 40px; }");
            out.println(".result { background-color: #e8f5e9; padding: 20px; border-radius: 5px; border-left: 4px solid #4CAF50; }");
            out.println(".info { margin: 10px 0; font-size: 16px; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Kết quả tính chỉ số BMI</h1>");
            out.println("<div class='result'>");
            out.println("<div class='info'><strong>Chiều cao:</strong> " + height + " cm</div>");
            out.println("<div class='info'><strong>Cân nặng:</strong> " + weight + " kg</div>");
            out.println("<div class='info'><strong>Chỉ số BMI:</strong> " + String.format("%.2f", bmi) + "</div>");
            out.println("<div class='info'><strong>Phân loại:</strong> " + classification + "</div>");
            out.println("</div>");
            out.println("<br>");
            out.println("<a href='/test/BMI'><button>Tính lại</button></a>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            out.println("<h2>Lỗi: Vui lòng nhập dữ liệu hợp lệ</h2>");
            out.println("<a href='/test/BMI'>Quay lại</a>");
        }
        out.close();
    }
}
