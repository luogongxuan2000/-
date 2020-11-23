<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 处理时间的格式标签-->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<html>
<body>

<div>
    <form action="/user/login" method="post">
        用户名:<input type="text" name="tel"><br>
        密码: <input type="password" name="password"><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
