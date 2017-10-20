<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by 蓝鸥科技有限公司  www.lanou3g.com.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>错误页面</title>
</head>
<body>
哦哦～～～不好意思，出错了～～
<%--错误信息显示在当前页面上--%>
<s:fielderror/>
<s:actionerror/>
</body>
</html>
