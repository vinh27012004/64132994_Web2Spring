package ntu.vinh.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BAITH1_4/BMI")
public class BAITH1_4 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>BAITH1_4 - BMI Calculator</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; background: linear-gradient(135deg, #1e3c72 0%, #2a5298 100%); }");
            out.println(".container { max-width: 500px; margin: 50px auto; background: white; padding: 40px; border-radius: 10px; box-shadow: 0 10px 30px rgba(0,0,0,0.3); }");
            out.println("h1 { color: #1e3c72; text-align: center; margin-bottom: 30px; }");
            out.println(".form-group { margin-bottom: 20px; }");
            out.println("label { display: block; margin-bottom: 5px; font-weight: bold; color: #495057; }");
            out.println("input[type='number'] { width: 100%; padding: 10px; border: 2px solid #ddd; border-radius: 5px; font-size: 16px; box-sizing: border-box; }");
            out.println("input[type='number']:focus { border-color: #1e3c72; outline: none; }");
            out.println("input[type='submit'] { width: 100%; padding: 12px; background: #1e3c72; color: white; border: none; border-radius: 5px; font-size: 16px; cursor: pointer; font-weight: bold; }");
            out.println("input[type='submit']:hover { background: #2a5298; }");
            out.println(".info { background: #e7f3ff; padding: 15px; border-radius: 5px; margin-top: 20px; font-size: 14px; color: #004085; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h1>🏃‍♂️ Tính chỉ số BMI</h1>");
            out.println("<form method='post' action='BMI'>");
            out.println("<div class='form-group'>");
            out.println("<label for='weight'>Cân nặng (kg):</label>");
            out.println("<input type='number' id='weight' name='weight' step='0.1' min='1' max='300' placeholder='Ví dụ: 65.5' required>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<label for='height'>Chiều cao (cm):</label>");
            out.println("<input type='number' id='height' name='height' step='0.1' min='50' max='250' placeholder='Ví dụ: 170' required>");
            out.println("</div>");
            out.println("<input type='submit' value='Tính BMI'>");
            out.println("</form>");
            out.println("<div class='info'>");
            out.println("<strong>BMI (Body Mass Index)</strong> là chỉ số đo lường mức độ tương quan giữa chiều cao và cân nặng.<br>");
            out.println("Công thức: BMI = Cân nặng (kg) / (Chiều cao (m))²");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            double weight = Double.parseDouble(request.getParameter("weight"));
            double height = Double.parseDouble(request.getParameter("height"));
            
            // Convert height from cm to m
            double heightInMeters = height / 100.0;
            
            // Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters);
            
            // Determine BMI category
            String category;
            String color;
            String advice;
            
            if (bmi < 18.5) {
                category = "Thiếu cân";
                color = "#ffc107";
                advice = "Bạn nên tăng cân để đạt được chỉ số BMI lý tưởng.";
            } else if (bmi < 25) {
                category = "Bình thường";
                color = "#28a745";
                advice = "Chỉ số BMI của bạn đang ở mức lý tưởng. Hãy duy trì!";
            } else if (bmi < 30) {
                category = "Thừa cân";
                color = "#ff9800";
                advice = "Bạn nên giảm cân và tập thể dục thường xuyên.";
            } else {
                category = "Béo phì";
                color = "#dc3545";
                advice = "Bạn nên tham khảo ý kiến bác sĩ và có chế độ ăn uống, tập luyện phù hợp.";
            }
            
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Kết quả BMI</title>");
                out.println("<style>");
                out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; background: linear-gradient(135deg, #1e3c72 0%, #2a5298 100%); }");
                out.println(".container { max-width: 500px; margin: 50px auto; background: white; padding: 40px; border-radius: 10px; box-shadow: 0 10px 30px rgba(0,0,0,0.3); }");
                out.println("h1 { color: #1e3c72; text-align: center; margin-bottom: 30px; }");
                out.println(".result { text-align: center; padding: 30px; background: #f8f9fa; border-radius: 10px; margin: 20px 0; }");
                out.println(".bmi-value { font-size: 48px; font-weight: bold; color: " + color + "; margin: 20px 0; }");
                out.println(".category { font-size: 24px; font-weight: bold; color: " + color + "; margin: 10px 0; }");
                out.println(".details { background: #e9ecef; padding: 20px; border-radius: 5px; margin: 20px 0; text-align: left; }");
                out.println(".details p { margin: 10px 0; }");
                out.println(".advice { background: #fff3cd; padding: 15px; border-radius: 5px; border-left: 4px solid " + color + "; margin: 20px 0; }");
                out.println("a { display: inline-block; margin-top: 20px; padding: 10px 20px; background: #1e3c72; color: white; text-decoration: none; border-radius: 5px; }");
                out.println("a:hover { background: #2a5298; }");
                out.println(".scale { margin: 20px 0; }");
                out.println(".scale-bar { display: flex; height: 30px; border-radius: 5px; overflow: hidden; }");
                out.println(".scale-segment { flex: 1; display: flex; align-items: center; justify-content: center; color: white; font-size: 12px; font-weight: bold; }");
                out.println("</style>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class='container'>");
                out.println("<h1>🎯 Kết quả BMI</h1>");
                out.println("<div class='result'>");
                out.println("<div class='bmi-value'>" + String.format("%.2f", bmi) + "</div>");
                out.println("<div class='category'>" + category + "</div>");
                out.println("</div>");
                out.println("<div class='details'>");
                out.println("<p><strong>Cân nặng:</strong> " + weight + " kg</p>");
                out.println("<p><strong>Chiều cao:</strong> " + height + " cm</p>");
                out.println("<p><strong>BMI:</strong> " + String.format("%.2f", bmi) + "</p>");
                out.println("</div>");
                out.println("<div class='advice'>");
                out.println("<strong>💡 Lời khuyên:</strong><br>" + advice);
                out.println("</div>");
                out.println("<div class='scale'>");
                out.println("<p><strong>Thang đo BMI:</strong></p>");
                out.println("<div class='scale-bar'>");
                out.println("<div class='scale-segment' style='background: #ffc107;'>&lt; 18.5</div>");
                out.println("<div class='scale-segment' style='background: #28a745;'>18.5-25</div>");
                out.println("<div class='scale-segment' style='background: #ff9800;'>25-30</div>");
                out.println("<div class='scale-segment' style='background: #dc3545;'>&gt; 30</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("<div style='text-align: center;'>");
                out.println("<a href='BMI'>← Tính lại</a>");
                out.println("</div>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            }
        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Dữ liệu không hợp lệ");
        }
    }
}
