<%--
  Created by IntelliJ IDEA.
  User: buxiaofeng
  Date: 17/3/9
  Time: 下午3:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>相册</title>
    <link rel="stylesheet" href="/content/libs/zoom/css/zoom.css">
    <style>
        body {
            overflow-y: scroll;
            font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue", Helvetica, sans-serif;
            background: #f4f4f4;
            padding: 0;
            margin: 0;
        }
        h1 {
            font-size: 31px;
            line-height: 32px;
            font-weight: normal;
            margin-bottom: 25px;
        }
        a,
        a:hover {
            border: none;
            text-decoration: none;
        }
        img,
        a img {
            border: none;
        }
        pre {
            overflow-x: scroll;
            background: #ffffff;
            border: 1px solid #cecece;
            padding: 10px;
        }

        .clear { clear: both;  }

        .zoomed > .container {
            -webkit-filter: blur(3px);
            filter: blur(3px);
        }

        .container {
            width: 1000px;
            margin: 0 auto;
            text-align: center;
        }

        .gallery {
            width: 1000px;
            float: left;
            background: #ffffff;
            padding: 20px 20px 10px 20px;
            margin: 0;
            -webkit-box-shadow: 0 1px 3px rgba(0,0,0,0.25);
            -moz-box-shadow: 0 1px 3px rgba(0,0,0,0.25);
            box-shadow: 0 1px 3px rgba(0,0,0,0.25);
            -webkit-border-radius: 2px;
            -moz-border-radius: 2px;
            border-radius: 2px;
        }
        .gallery div {
            float: left;
            padding: 0 10px 10px 0;
        }
        /*.gallery div:nth-child(6n) {*/
            /*padding-right: 0;*/
        /*}*/
        .gallery a,
        .gallery img {
            float: left;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>你的相册</h1>
    <div class="gallery">
        <s:iterator value="#request.pictureList" id="picture">
            <div>
                <a href="<s:property value='#picture.picture_path'/>" >
                    <img src="<s:property value='#picture.picture_path'/>" style="width: 180px;height: 240px"/>
                </a>
            </div>
        </s:iterator>
    </div>
</div>
    <script src="/content/js/jquery-2.2.3.min.js"></script>
    <script src="/content/libs/zoom/js/zoom.js"></script>
</body>
</html>
