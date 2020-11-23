<%--
  Created by IntelliJ IDEA.
  User: legendluo
  Date: 2020/11/20
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--jstl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--是否使用字节输出--%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.min.css">
    <style>
        .all th {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="all">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">

            <table class="table table-hover" border="1">
                <tr>
                    <th colspan="7">
                        <button type="button" class="btn btn-warning">
                            <a href="/insert.jsp">新增</a>
                        </button>

                    </th>

                </tr>
                <tr>
                    <th>id:</th>
                    <th>name:</th>
                    <th>des:</th>
                    <th>price:</th>
                    <th>discount:</th>
                    <th>pic</th>
                    <th>操作</th>
                </tr>

                <c:forEach var="list" items="${carlist}">
                    <tr>
                        <th>${list.id}</th>
                        <th>${list.name}</th>
                        <th>${list.type}</th>
                        <th>${list.sitnum}</th>
                        <th>${list.price}</th>
                        <th>
                            <img src="${list.picture}" style="width: 50px"height="50px"></th>
                    </tr>
                </c:forEach>
                <tr>
                    <th colspan="7">

                        <a href="/car/findAll?page=1">
                            <button type="button" class="btn btn-info">
                                首页
                            </button>
                        </a>
                        &nbsp; 当前${pg.pageNum}页/总共${pg.pages}页 &nbsp;
                        <a href="/car/findAll?page=${pg.pages}">
                            <button type="button" class="btn btn-info">
                                末页
                            </button>
                        </a>
                    </th>
                </tr>

                <tr>
                    <th colspan="7">
                        <nav aria-label="Page navigation">
                            <ul class="pagination">
                                <li>
                                <li>
                                    <c:if test="${pg.pageNum != 1}">
                                        <a href="/car/findAll?page=${pg.pageNum-1}" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
                                    </c:if>
                                </li>
                                <li class="disabled">
                                    <c:if test="${pg.pageNum == 1}">
                                        <a href="#" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
                                    </c:if>
                                </li>

                                </li>
                                <li><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">5</a></li>
                                <li>
                                <li class="disabled"><%--如果是最后一页--%>
                                    <c:if test="${pg.isLastPage ==true}">
                                        <a href="#" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                    </c:if>
                                </li>
                                <li>
                                    <c:if test="${pg.isLastPage ==false}">
                                        <a href="/car/findAll?page=${pg.nextPage}" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                    </c:if>
                                </li>
                                </li>
                            </ul>
                        </nav>
                    </th>
                </tr>
            </table>
        </div>
        <div class="col-md-2"></div>
    </div>
</div>





</body>
</html>