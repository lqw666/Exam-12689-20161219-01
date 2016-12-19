<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="dao.GetLanguage"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
请输入你要添加的电影信息：<br>
<form action="AddFilm" method="post">
电影名字：<input type="text" name="title"><br>
描述：<input type="text" name="description"><br>
语言:<select name="language">
<%
 Set<String> names=new GetLanguage().getnames();
Iterator iterator=names.iterator();
while(iterator.hasNext()){
	String name=iterator.next().toString();
	%><option><%=name%></option><%
	}
%>
</select>
<input type="submit" value="提交">
</form>
</body>
</html>