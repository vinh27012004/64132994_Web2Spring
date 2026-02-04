<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home - Bài Tập 1</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }
        
        .container {
            background: white;
            border-radius: 15px;
            box-shadow: 0 20px 60px rgba(0,0,0,0.3);
            padding: 50px;
            max-width: 600px;
            width: 100%;
        }
        
        h1 {
            color: #333;
            text-align: center;
            margin-bottom: 10px;
            font-size: 32px;
        }
        
        .subtitle {
            text-align: center;
            color: #666;
            margin-bottom: 40px;
            font-size: 16px;
        }
        
        .menu {
            display: grid;
            grid-template-columns: 1fr 1fr;
            gap: 20px;
        }
        
        .menu-item {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            padding: 30px;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            border-radius: 10px;
            text-decoration: none;
            color: white;
            transition: all 0.3s ease;
            min-height: 150px;
            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
        }
        
        .menu-item:hover {
            transform: translateY(-5px);
            box-shadow: 0 15px 30px rgba(0,0,0,0.2);
        }
        
        .menu-item.item1 {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        }
        
        .menu-item.item2 {
            background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);
        }
        
        .menu-item.item3 {
            background: linear-gradient(135deg, #4facfe 0%, #00f2fe 100%);
        }
        
        .menu-item.item4 {
            background: linear-gradient(135deg, #43e97b 0%, #38f9d7 100%);
        }
        
        .menu-item-icon {
            font-size: 40px;
            margin-bottom: 10px;
        }
        
        .menu-item-title {
            font-size: 18px;
            font-weight: bold;
            text-align: center;
            margin-bottom: 5px;
        }
        
        .menu-item-desc {
            font-size: 12px;
            text-align: center;
            opacity: 0.9;
        }
        
        @media (max-width: 600px) {
            .container {
                padding: 30px 20px;
            }
            
            h1 {
                font-size: 24px;
            }
            
            .menu {
                grid-template-columns: 1fr;
            }
        }
    </style>
</head>
<body>
<div class="container">
    <h1>📚 Bài Tập 1 - Web với Spring</h1>
    <p class="subtitle">Chọn một bài tập để bắt đầu</p>
    
    <div class="menu">
        <a href="${pageContext.request.contextPath}/BAITH1_1/testDoGet" class="menu-item item1">
            <div class="menu-item-icon">📤</div>
            <div class="menu-item-title">BAITH1_1</div>
            <div class="menu-item-desc">Test DoGet</div>
        </a>
        
        <a href="${pageContext.request.contextPath}/BAITH1_2/testDoPost" class="menu-item item2">
            <div class="menu-item-icon">📝</div>
            <div class="menu-item-title">BAITH1_2</div>
            <div class="menu-item-desc">Test DoPost</div>
        </a>
        
        <a href="${pageContext.request.contextPath}/BAITH1_3/AboutMe" class="menu-item item3">
            <div class="menu-item-icon">👤</div>
            <div class="menu-item-title">BAITH1_3</div>
            <div class="menu-item-desc">About Me</div>
        </a>
        
        <a href="${pageContext.request.contextPath}/BAITH1_4/BMI" class="menu-item item4">
            <div class="menu-item-icon">🏃‍♂️</div>
            <div class="menu-item-title">BAITH1_4</div>
            <div class="menu-item-desc">BMI Calculator</div>
        </a>
    </div>
</div>
</body>
</html>