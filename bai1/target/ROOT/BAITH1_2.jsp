<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>BAITH1_2 - Test DoPost</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 50px; }
        h1 { color: #2c3e50; }
        form { margin-top: 20px; }
        input[type='text'] { padding: 8px; margin: 5px 0; width: 250px; }
        input[type='submit'] { padding: 10px 20px; background: #3498db; color: white; border: none; cursor: pointer; }
        input[type='submit']:hover { background: #2980b9; }
        a { color: #3498db; text-decoration: none; }
    </style>
</head>
<body>
<h1>BAITH1_2 - Test DoPost Method</h1>
<form method="post" action="${pageContext.request.contextPath}/BAITH1_2/testDoPost">
    <label>Tên của bạn:</label><br>
    <input type="text" name="name" placeholder="Nhập tên..." required><br><br>
    <label>Email:</label><br>
    <input type="text" name="email" placeholder="Nhập email..." required><br><br>
    <input type="submit" value="Gửi">
</form>
<p><a href="${pageContext.request.contextPath}/">← Về trang chủ</a></p>
</body>
</html>
