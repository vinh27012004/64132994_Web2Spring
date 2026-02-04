package ntu.vinh.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/BAITH1_4/BMI")
public class BAITH1_4 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/BAITH1_4.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            double weight = Double.parseDouble(request.getParameter("weight"));
            double height = Double.parseDouble(request.getParameter("height"));

            double heightInMeters = height / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);

            String category;
            String color;
            String advice;
            String levelClass;

            if (bmi < 18.5) {
                category = "Thiếu cân";
                color = "#ffc107";
                advice = "Bạn nên tăng cân để đạt được chỉ số BMI lý tưởng.";
                levelClass = "bmi-thin";
            } else if (bmi < 25) {
                category = "Bình thường";
                color = "#28a745";
                advice = "Chỉ số BMI của bạn đang ở mức lý tưởng. Hãy duy trì!";
                levelClass = "bmi-normal";
            } else if (bmi < 30) {
                category = "Thừa cân";
                color = "#ff9800";
                advice = "Bạn nên giảm cân và tập thể dục thường xuyên.";
                levelClass = "bmi-over";
            } else {
                category = "Béo phì";
                color = "#dc3545";
                advice = "Bạn nên tham khảo ý kiến bác sĩ và có chế độ ăn uống, tập luyện phù hợp.";
                levelClass = "bmi-obese";
            }

            request.setAttribute("weight", weight);
            request.setAttribute("height", height);
            request.setAttribute("bmi", bmi);
            request.setAttribute("bmiFormatted", String.format("%.2f", bmi));
            request.setAttribute("category", category);
            request.setAttribute("color", color);
            request.setAttribute("advice", advice);
            request.setAttribute("levelClass", levelClass);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/BAITH1_4_result.jsp");
            dispatcher.forward(request, response);
        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Dữ liệu không hợp lệ");
        }
    }
}
