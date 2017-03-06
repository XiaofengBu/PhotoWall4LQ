<%--
  Created by IntelliJ IDEA.
  User: buxiaofeng
  Date: 17/2/28
  Time: 下午8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图片墙样例</title>
    <style type="text/css">
        *{padding: 0;margin: 0}
        body{
            background-color: #fff;
            color: #555;
            font-family:'Avenir Next','Lantinghei SC';
            font-size:14px;
            -webkit-font-smoothing: antialiased;
        }
        /*框子样式*/
        .wrap{
            width:100%;
            heigth:600px;
            position: absolute;
            top:50%;
            margin-top: 300px;
            background-color: #333;
            overflow: hidden;
        }
        /*海报样式*/
        .photo{
            width:260px;
            height: 320px;
            position: absolute;
            z-index: 1;
            box-shadow: 0 0 1px rgba(0,0,0,0.01);
        }
        .photo .side{
            width: 100%;
            height:100%;
            background-color: #eee;
            top:0;
            right:0;
            padding: 20px;
            box-sizing: border-box;
        }
        .photo .side-front{display: none}
        .photo .side-front .image{
            width:100%;
            height: 250px;
            line-height: 250px;
            overflow: hidden;
        }
        .photo .side-front .image img{
            width: 100%;
        }
        .photo .side-front .caption{
            text-align:center;
            font-size: 16px;
            line-height: 50px;
        }
        .photo .side-back{
            color: #666;
            font-size: 14px;
            line-height: 1.5em;
        }
    </style>
</head>
<body>
    <div class="wrap">
        <div class="photo">
            <div class="side side-front">
                <p class="image"><img src="content/images/demo/timg.jpg"></p>
                <p class="caption">测试图片</p>
            </div>
            <div class="side side-back">
                <p class="desc">描述</p>
            </div>
        </div>
    </div>

    <script src="content/js/jquery-2.2.3.min.js"></script>
</body>
</html>
