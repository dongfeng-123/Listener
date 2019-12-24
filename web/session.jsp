<%--
  Created by IntelliJ IDEA.
  User: 风
  Date: 2019/12/23
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session销毁页面创建成功</title>
</head>
<body>
<h5 style="color: red;text-align: center;font-size: 50px" >此页面创建成功</h5>
<%session.invalidate ();%>
</body>
</html>
