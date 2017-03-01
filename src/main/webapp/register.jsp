<%--
  Created by IntelliJ IDEA.
  User: buxiaofeng
  Date: 17/2/28
  Time: 下午9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="content/css/bootstrap.min.css">
    <link rel="stylesheet" href="content/css/AdminLTE.min.css">
    <link rel="stylesheet" href="content/css/font-awesome.min.css">
    <link rel="stylesheet" href="content/css/ionicons.min.css">
</head>
<body class="hold-transition register-page">
<div class="register-box">
    <div class="register-logo">
        <a href="#"><b>LQ</b>照片墙</a>
    </div>

    <div class="register-box-body">
        <p class="login-box-msg">注册照片墙</p>

        <form action="register!register.action" method="post" onsubmit="ioCheck()">
            <div class="form-group has-feedback">
                <input class="form-control" placeholder="用户名" type="text" name="username">
                <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input class="form-control" placeholder="姓名" type="text" name="chn_Name">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input class="form-control" placeholder="密码" type="password" name="password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input class="form-control" placeholder="重复密码" type="password" name="retry_password">
                <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-6">
                    <input type="button" class="btn btn-primary btn-block btn-flat" value="去登陆" onclick="window.location='/index.jsp'"/>
                </div>
                <!-- /.col -->
                <div class="col-xs-6">
                    <input type="submit" class="btn btn-primary btn-block btn-flat" value="注册"/>
                </div>
                <!-- /.col -->
            </div>
        </form>
    </div>
    <!-- /.form-box -->
</div>
<script src="content/js/jquery-2.2.3.min.js"></script>
<script src="content/js/bootstrap.min.js"></script>
<script src="content/libs/js/commons.js"></script>
<script>
    function ioCheck() {
        var username=$("*[name='username']").val();
        var chn_Name=$("*[name='chn_Name']").val();
        var password=$("*[name='password']").val();
        var retry_password=$("*[name='retry_password']").val();
        if(username==""||chn_Name==""||password==""){
            alert("输入不能为空!");
            return false;
        }else if(password!=retry_password){
            alert("两次输入的密码不相同!");
            return false;
        }else{
            return true;
        }
    }
</script>
</body>
</html>
