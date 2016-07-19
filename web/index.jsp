<%--
  Created by IntelliJ IDEA.
  User: 29624
  Date: 2016/7/6
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  Hello World !
  <%
    String s = Jackie.Request.sendGet("http://demochina.synology.me:7090/webapi/query.cgi","api=SYNO.API.Info&method=Query&version=1&query=SYNO.API.Auth,SYNO.SurveillanceStation");
    out.println(s);
  %>
  <input type="button" value="Jackie" onclick = "">
  </body>
</html>
