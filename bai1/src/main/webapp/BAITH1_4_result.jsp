<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Kết quả BMI</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 0; padding: 0; background: linear-gradient(135deg, #1e3c72 0%, #2a5298 100%); }
        .container { max-width: 500px; margin: 50px auto; background: white; padding: 40px; border-radius: 10px; box-shadow: 0 10px 30px rgba(0,0,0,0.3); }
        h1 { color: #1e3c72; text-align: center; margin-bottom: 30px; }
        .result { text-align: center; padding: 30px; background: #f8f9fa; border-radius: 10px; margin: 20px 0; }
        .bmi-value { font-size: 48px; font-weight: bold; margin: 20px 0; }
        .category { font-size: 24px; font-weight: bold; margin: 10px 0; }
        .details { background: #e9ecef; padding: 20px; border-radius: 5px; margin: 20px 0; text-align: left; }
        .details p { margin: 10px 0; }
        .advice { background: #fff3cd; padding: 15px; border-radius: 5px; margin: 20px 0; }
        a { display: inline-block; margin-top: 20px; padding: 10px 20px; background: #1e3c72; color: white; text-decoration: none; border-radius: 5px; }
        a:hover { background: #2a5298; }
        .scale { margin: 20px 0; }
        .scale-bar { display: flex; height: 30px; border-radius: 5px; overflow: hidden; }
        .scale-segment { flex: 1; display: flex; align-items: center; justify-content: center; color: white; font-size: 12px; font-weight: bold; }

        /* màu theo cấp độ */
        .bmi-thin { color: #ffc107; }
        .bmi-normal { color: #28a745; }
        .bmi-over { color: #ff9800; }
        .bmi-obese { color: #dc3545; }
        .advice.bmi-thin { border-left: 4px solid #ffc107; }
        .advice.bmi-normal { border-left: 4px solid #28a745; }
        .advice.bmi-over { border-left: 4px solid #ff9800; }
        .advice.bmi-obese { border-left: 4px solid #dc3545; }
    </style>
</head>
<body>
<div class="container">
    <h1>🎯 Kết quả BMI</h1>
    <div class="result">
        <div class="bmi-value ${levelClass}">${bmiFormatted}</div>
        <div class="category ${levelClass}">${category}</div>
    </div>
    <div class="details">
        <p><strong>Cân nặng:</strong> ${weight} kg</p>
        <p><strong>Chiều cao:</strong> ${height} cm</p>
        <p><strong>BMI:</strong> ${bmiFormatted}</p>
    </div>
    <div class="advice ${levelClass}">
        <strong>💡 Lời khuyên:</strong><br>${advice}
    </div>
    <div class="scale">
        <p><strong>Thang đo BMI:</strong></p>
        <div class="scale-bar">
            <div class="scale-segment" style="background: #ffc107;">&lt; 18.5</div>
            <div class="scale-segment" style="background: #28a745;">18.5-25</div>
            <div class="scale-segment" style="background: #ff9800;">25-30</div>
            <div class="scale-segment" style="background: #dc3545;">&gt; 30</div>
        </div>
    </div>
    <div style="text-align: center;">
        <a href="${pageContext.request.contextPath}/BAITH1_4/BMI">← Tính lại</a>
    </div>
</div>
</body>
</html>
