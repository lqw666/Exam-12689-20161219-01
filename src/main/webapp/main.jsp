
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="bean.*"
    %>
<%@ page import="mybean.data.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%
 Login login=(Login)session.getAttribute("login"); 
%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>主页</title>
</head>
<body>
<h4>欢迎：<%=request.getParameter("username") %></h4>
<a href="showfilms.jsp">显示所有电影信息</a>
<a href="addfilm.jsp">新增电影信息</a>
</body>
</html>