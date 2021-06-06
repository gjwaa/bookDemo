<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" value="${book.getBookID()}" name="bookID"/>
        书籍名称：<input type="text" value="${book.getBookName()}" name="bookName"/><br><br><br>
        书籍数量：<input type="text" value="${book.getBookCounts()}" name="bookCounts"/><br><br><br>
        书籍详情：<input type="text" value="${book.getDetail()}" name="detail"/><br><br><br>
        <input type="submit" value="修改"/>
    </form>

</div>