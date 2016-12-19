
<%@page import="java.util.Iterator"%>
<%@page import="dao.ShowFilms"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="bean.*"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<div>
<a href="main.jsp">返回首页</a>
<form action="DeleteFilm" method="post">

<div>
<table border="1">
<tr><th>电影编号</th><th>电影名</th><th>描述</th><th>语言</th><th>操作</th></tr>
<%
Set<FilmShow> filmset=new ShowFilms().getfilms();
Iterator iterator=filmset.iterator();
while(iterator.hasNext()){
	FilmShow filmShow=(FilmShow)iterator.next();
	%> 
	<tr>
	<td><input type="text" name="id" value=<%=filmShow.getFilm_id() %>></td><td><%=filmShow.getTitle()%></td>
	<td><%=filmShow.getDescription() %></td><td><%=filmShow.getLanguage() %></td>
	<td><input type="submit" value="删除">&nbsp;<a href="update.jsp">修改</a></td>
	</tr>
	<% 
}
%>
</table>
</div></form>
</div>

</body>
</html>