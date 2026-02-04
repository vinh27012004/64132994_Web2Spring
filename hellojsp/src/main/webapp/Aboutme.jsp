<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>BAITH1_3 - About Me</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin: 0; padding: 0; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); }
        .container { max-width: 600px; margin: 50px auto; background: white; padding: 40px; border-radius: 10px; box-shadow: 0 10px 30px rgba(0,0,0,0.3); }
        h1 { color: #667eea; text-align: center; margin-bottom: 30px; }
        .info { margin: 20px 0; }
        .info-item { display: flex; padding: 15px; margin: 10px 0; background: #f8f9fa; border-left: 4px solid #667eea; border-radius: 5px; }
        .info-label { font-weight: bold; width: 150px; color: #495057; }
        .info-value { color: #212529; }
        .avatar { text-align: center; margin-bottom: 30px; }
        .avatar-circle { width: 120px; height: 120px; border-radius: 50%; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); margin: 0 auto; display: flex; align-items: center; justify-content: center; color: white; font-size: 48px; font-weight: bold; }
        a { color: #3498db; text-decoration: none; }
    </style>
</head>
<body>
<div class="container">
    <div class="avatar">
        <div class="avatar-circle">NV</div>
    </div>
    <h1>Thông Tin Cá Nhân</h1>
    <div class="info">
        <div class="info-item">
            <div class="info-label">Họ và tên:</div>
            <div class="info-value">Phạm Nguyễn Trí Vinh</div>
        </div>
        <div class="info-item">
            <div class="info-label">MSSV:</div>
            <div class="info-value">64132994</div>
        </div>
        <div class="info-item">
            <div class="info-label">Lớp:</div>
            <div class="info-value">64.CNTT-CLC</div>
        </div>
        <div class="info-item">
            <div class="info-label">Khoa:</div>
            <div class="info-value">Công nghệ thông tin</div>
        </div>
        <div class="info-item">
            <div class="info-label">Email:</div>
            <div class="info-value">vinh.pnt.64cntt@ntu.edu.vn</div>
        </div>
        <div class="info-item">
            <div class="info-label">Sở thích:</div>
            <div class="info-value">Lập trình</div>
        </div>
    </div>
    <p><a href="${pageContext.request.contextPath}/">← Về trang chủ</a></p>
</div>
</body>
</html>
