<%--
  Created by IntelliJ IDEA.
  User: buxiaofeng
  Date: 17/3/7
  Time: 下午8:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>照片上传</title>
    <link rel="stylesheet" href="/content/libs/fileUpload/control/css/zyUpload.css" type="text/css">
    <style type="text/css">
        .see{
            background: none repeat scroll 0 0 #00B7EE;
            border-radius: 3px;
            color: #fff;
            font-size: 14px;
            margin-left: 10px;
            padding: 0 18px;
            position: relative;
            text-align: center;
            line-height: 34px;
        }
    </style>
</head>
<body>
    <h1 style="text-align:center;">上传图片</h1>
    <div id="demo" class="demo"></div>
    <form action="/login!login.action" method="post">
    <div class="right" style="text-align: center"><input type="submit" class="see" value="查看相册"></div>
    </form>
    <script src="/content/js/jquery-2.2.3.min.js"></script>
    <script src="/content/libs/fileUpload/core/zyFile.js"></script>
    <script src="/content/libs/fileUpload/control/js/zyUpload.js"></script>
    <script src="/content/libs/fileUpload/control/js/demo.js"></script>
</body>
</html>
