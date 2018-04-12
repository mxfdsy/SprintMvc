<%--
  Created by IntelliJ IDEA.
  User: 平凡的世界
  Date: 2018/4/11
  Time: 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这个页面是来演示文件下载的
<form method="post" action="/user/upload" enctype="multipart/form-data">
    <input type="text" name="id">
    <input type="file" name="file">
    <input type="submit" value="提交">
</form>
<a href="/user/down">点我下载</a>
</body>
</html>
