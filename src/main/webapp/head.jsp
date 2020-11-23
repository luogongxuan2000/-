<%--
  Created by IntelliJ IDEA.
  User: legendluo
  Date: 2020/11/22
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--是否使用字节输出--%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title></title>
    <link type="text/css" rel="stylesheet" href="/bootstrap/css/bootstrap.min.css"/>
    <link type="text/css" rel="stylesheet" href="css/head.css">
</head>
<script type="text/javascript" src="state/bootstrap/jquery-3.4.1.min.js"></script>

<body>
<div id="all">
    <div class="row bt_lay1">
        <div class="col-md-1 col-md-offset-2">
            <c:if test="${empty user.name}">
                <a href="/user/index.jsp">登陆</a>
            </c:if>
            <c:if test="${ !empty user.name}">
                ${user.name}
            </c:if>
        </div>
        <div class="col-md-1">
            <c:if test="${empty user.name}">
                <a href="/">注册</a>
            </c:if>
            <c:if test="${ !empty user.name}">
                欢迎!
            </c:if>
        </div>
        <div class="col-md-1">手机租车</div>
        <div class="col-md-1">
            帮助中心
        </div>
        <div class="col-md-1 col-md-offset-3 dl">
            中文&nbsp;/
        </div>
        <div class="col-md-1 dl">
            &nbsp;英文

        </div>
        <div class="col-md-1 ">
            我的车速递
        </div>
        <%--鼠标样式--%>
        <div class="col-md-1" id="logout" style="cursor: pointer">注销登陆</div>
    </div>
</div>
</body>
</html>
