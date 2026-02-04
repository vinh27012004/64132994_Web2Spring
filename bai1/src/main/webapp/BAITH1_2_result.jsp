<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>BAITH1_2 - Kết quả</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 50px; }
        h1 { color: #27ae60; }
        .result { background: #ecf0f1; padding: 20px; border-radius: 5px; }
        a { color: #3498db; text-decoration: none; }
    </style>
</head>
<body>
<h1>Dữ liệu đã nhận (POST Method)</h1>
<div class="result">
    <p><strong>Tên:</strong> ${name}</p>
    <p><strong>Email:</strong> ${email}</p>
</div>
<br>
<a href="${pageContext.request.contextPath}/BAITH1_2/testDoPost">← Quay lại</a>
</body>
</html>
