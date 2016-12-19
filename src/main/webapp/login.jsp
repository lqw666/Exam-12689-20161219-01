<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">

 #login{
  	width:300px;
  	height:200px;
  	margin-top: 40px;
  	margin-left: 530px;
  	border: 1px solid #accfaf;
  	}
  	#login ul{
	margin: 0px; 
	padding: 0px; 
	margin-left:20px;
	margin-top:30px;
	}
	#login ul li{
	list-style:none;
	line-height:50px;
	font-size:16px;
	background:none;
	}
	#login ul li.a{
	font-size:30px;
	}
</style>

</head>
<body>
<div style="text-align: center;">
	<font size="36"> 
	电影租赁系统 
	</font>
	</div>
 <div id="login">
<ul>
<li class="a">用户登录</li>
  <form action="helpLogin" method="post" style="background:none;">
  <li>用 户 名：<input type="text" name="username" style="height:34px;background:none;"> </li>
  <li><input type="submit" name="tijiao" value="登   录" style="width:150px;height:40px;"></li>
  </form>
  </ul>
  </div>
</body>
</html>