<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>BAITH1_1 - Test DoGet</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 50px; }
        h1 { color: #2c3e50; }
        p { font-size: 16px; }
        a { color: #3498db; text-decoration: none; }
    </style>
</head>
<body>
<h1>BAITH1_1 - Test DoGet Method</h1>
<p>Đây là servlet sử dụng phương thức <strong>doGet()</strong></p>
<p>URL: <code>${pageContext.request.contextPath}/BAITH1_1/testDoGet</code></p>
<p>Method: <strong>GET</strong></p>
<p><a href="${pageContext.request.contextPath}/">← Về trang chủ</a></p>
</body>
</html>
