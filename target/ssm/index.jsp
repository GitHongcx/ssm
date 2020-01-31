<%--
  Created by IntelliJ IDEA.
  User: HCX
  Date: 2020/1/4
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">test</a>

    <form action="/account/save" method="post">
        账户：<input type="text" name="name"><br>
        金额：<input type="text" name="money"><br>
        <input type="submit" value="保存">
    </form>
</body>
</html>
