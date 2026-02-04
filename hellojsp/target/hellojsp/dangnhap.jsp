<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
    <h1>Đăng nhập</h1>
    <form method="post">
        <label>Tên đăng nhập:</label>
        <input type="text" name="tenDN" />
        <br/>
        <label>Mật khẩu:</label>
        <input type="password" name="matKhau" />
        <br/>
        <button type="submit">Đăng nhập</button>
    </form>

    <%  String tenDN ="trivinh"; 
        String matKhau="123456";
        String tenDNNhap = request.getParameter("tenDN");
        String matKhauNhap = request.getParameter("matKhau");
        if(tenDNNhap != null && matKhauNhap != null){
            if(tenDN.equals(tenDNNhap) && matKhau.equals(matKhauNhap)){
                request.getRequestDispatcher("Aboutme.jsp").forward(request, response);
                return;
            } else {
    %>
                <h3>Đăng nhập thất bại</h3>
    <%      }
        }
    %>
</body>
</html>
