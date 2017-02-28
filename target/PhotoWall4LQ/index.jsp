<%--
  <!--Created by IntelliJ IDEA.-->
  <!--User: buxiaofeng-->
  <!--Date: 17/2/28-->
  <!--Time: 下午3:36-->
  <!--To change this template use File | Settings | File Templates.-->
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="content/css/bootstrap.min.css">
    <link rel="stylesheet" href="content/css/AdminLTE.min.css">
    <link rel="stylesheet" href="content/css/font-awesome.min.css">
    <link rel="stylesheet" href="content/css/ionicons.min.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><b>LQ</b>照片墙</a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">登陆查看你的照片墙</p>
        <form action="/login!login.action" method="post">
            <div class="form-group has-feedback">
                <input class="form-control" placeholder="用户名" type="index" name="username">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input class="form-control" placeholder="密码" type="password" name="password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox" name="checkbox" fieldValue="wmj2003">  记住我
                        </label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <input type="submit" class="btn btn-primary btn-block btn-flat" value="登陆"/>
                </div>
                <!-- /.col -->
            </div>
        </form>

        <a href="register.html" class="text-center">注册新的账户</a>

    </div>
    <!-- /.login-box-body -->
</div>


<script src="content/js/jquery-2.2.3.min.js"></script>
<script src="content/js/bootstrap.min.js"></script>
<script src="content/libs/js/commons.js"></script>
<script>
</script>
</body>
</html>
