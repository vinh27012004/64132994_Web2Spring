<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>BAITH1_4 - BMI Calculator</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 0; padding: 0; background: linear-gradient(135deg, #1e3c72 0%, #2a5298 100%); }
        .container { max-width: 500px; margin: 50px auto; background: white; padding: 40px; border-radius: 10px; box-shadow: 0 10px 30px rgba(0,0,0,0.3); }
        h1 { color: #1e3c72; text-align: center; margin-bottom: 30px; }
        .form-group { margin-bottom: 20px; }
        label { display: block; margin-bottom: 5px; font-weight: bold; color: #495057; }
        input[type='number'] { width: 100%; padding: 10px; border: 2px solid #ddd; border-radius: 5px; font-size: 16px; box-sizing: border-box; }
        input[type='number']:focus { border-color: #1e3c72; outline: none; }
        input[type='submit'] { width: 100%; padding: 12px; background: #1e3c72; color: white; border: none; border-radius: 5px; font-size: 16px; cursor: pointer; font-weight: bold; }
        input[type='submit']:hover { background: #2a5298; }
        .info { background: #e7f3ff; padding: 15px; border-radius: 5px; margin-top: 20px; font-size: 14px; color: #004085; }
        a { color: #3498db; text-decoration: none; }
    </style>
</head>
<body>
<div class="container">
    <h1>🏃‍♂️ Tính chỉ số BMI</h1>
    <form method="post" action="${pageContext.request.contextPath}/BAITH1_4/BMI">
        <div class="form-group">
            <label for="weight">Cân nặng (kg):</label>
            <input type="number" id="weight" name="weight" step="0.1" min="1" max="300" placeholder="Ví dụ: 65.5" required>
        </div>
        <div class="form-group">
            <label for="height">Chiều cao (cm):</label>
            <input type="number" id="height" name="height" step="0.1" min="50" max="250" placeholder="Ví dụ: 170" required>
        </div>
        <input type="submit" value="Tính BMI">
    </form>
    <div class="info">
        <strong>BMI (Body Mass Index)</strong> là chỉ số đo lường mức độ tương quan giữa chiều cao và cân nặng.<br>
        Công thức: BMI = Cân nặng (kg) / (Chiều cao (m))²
    </div>
    <p><a href="${pageContext.request.contextPath}/">← Về trang chủ</a></p>
</div>
</body>
</html>
