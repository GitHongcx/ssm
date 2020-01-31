<%--
  Created by IntelliJ IDEA.
  User: HCX
  Date: 2020/1/4
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>账户列表</title>
</head>
<body>
    <h4>所有账户列表</h4>
    <c:forEach items="${accountList}" var="account">
        ${account.name}
    </c:forEach>
</body>
</html>
