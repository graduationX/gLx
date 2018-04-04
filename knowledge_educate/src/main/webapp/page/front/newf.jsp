<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>Typograpsd</title>

    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="css/ie.css" media="screen" /><![endif]-->
    <!-- BEGIN: load jquery -->
    <script src="${pageContext.request.contextPath }/js/jquery-1.6.4.min.js" type="text/javascript"></script>

    <!-- END: load jquery -->
    <script src="${pageContext.request.contextPath }/js/angular-1.5.8/angular.min.js" type="text/javascript"></script>
    
    <style >
    	.ng-cloak{
    	display: none;
    	}
    </style>
    <script type="text/javascript">
    	
    </script>
 
                   
</head>

<body>
        <div ng-app="myApp" ng-controller="myCtrl">
            <input type="text" ng-model="name" /><br />
            <button ng-click="toggle()">点我</button>
        </div>
        <script type="text/javascript">
    
            var app=angular.module("myApp",[]);
            app.controller('myCtrl',function($scope){
                $scope.toggle=function(){
                    alert($scope.name);
                }
            })
        </script>
    </body>
</html>
