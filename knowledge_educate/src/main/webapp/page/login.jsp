<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="viewport"
        content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>Amaze UI Examples</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath }/css/amazeui.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath }/css/app.css">
</head>
<body>
<div class="am-g myapp-login">
	<div class="myapp-login-logo-block">
		<div class="myapp-login-logo">
			<i class="am-icon-jsfiddle"></i>
		</div>
		<div class="myapp-login-logo-text">
			<div class="myapp-login-logo-text">
				Js<span>Fiddle</span>
				<div class="info">Find the best places in town.</div>
			</div>
		</div>

		<div class="login-font">
			<i>Log In </i> or <span> Sign Up</span>
			<c:if test="${not empty msg}">
			<div><span style="color: red; size: 90px;"> <font size="5">${msg}</font></span> </div>
			</c:if>
			
		</div>
		<div class="am-u-sm-10 login-am-center">
			<form class="am-form" method="post">
				<fieldset>
					<div class="am-form-group">
						<input type="text" name="username" class="" id="doc-ipt-email-1" placeholder="输入用户名">
					</div>

					<div class="am-form-group">
						<input type="password" name="password" class="" id="doc-ipt-pwd-1" placeholder="输入密码">
					</div>
					<p><button type="submit" class="am-btn am-btn-default">Log In</button></p>
				</fieldset>
			</form>
			
		</div>
	</div>
</div>
<div><center> moban <a>liu</a> -  More Templates  <a title="网页模板" target="_blank">学生管理</a></center>
 </div>
<!--[if (gte IE 9)|!(IE)]><!-->
<script src="${pageContext.request.contextPath }js/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script src="${pageContext.request.contextPath }/js/amazeui.min.js"></script>
<script src="${pageContext.request.contextPath }/js/app.js"></script>
</body>
</html>