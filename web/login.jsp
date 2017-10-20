<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by 蓝鸥科技有限公司  www.lanou3g.com.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript">

        function changeImg() {
            var codeImg = document.getElementById("codeImg");
            codeImg.src = "requestCodeImg.action?date=" + Math.random();
        }

    </script>
</head>
<body>
<form method="post" action="login.action">
    用户名：<input type="text" name="sname"><br>
    密码：<input type="password" name="password"><br>
    验证码：<input type="text" name="verifyCode">
    <img id="codeImg" src="requestCodeImg.action"
         onclick="changeImg()"><br>
    <input type="submit" value="登录">
</form>

<%--错误信息提示--%>
<s:actionerror/>
</body>
</html>
