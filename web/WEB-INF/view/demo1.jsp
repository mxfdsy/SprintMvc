<%--
  Created by IntelliJ IDEA.
  User: 平凡的世界
  Date: 2018/4/8
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
这个页面是来演示post提交的参数信息的
<form method="post" action="/user/demo2">
    <input type="text" name="id">
    <input type="text" name="name">
    <input type="submit" value="提交">
</form>
</body>
</html>
