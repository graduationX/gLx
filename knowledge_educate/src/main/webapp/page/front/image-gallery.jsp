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
    <title>Pretty Photo | BlueWhale Admin</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/reset.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/text.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/grid.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/layout.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/nav.css" media="screen" />
    <link href="${pageContext.request.contextPath }/css/prettyPhoto.css" rel="stylesheet" type="text/css" />
    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/ie6.css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/ie.css" media="screen" /><![endif]-->
    <!-- BEGIN: load jquery -->
    <script src="${pageContext.request.contextPath }/" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-1.6.4.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.core.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.widget.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.accordion.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.effects.core.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.effects.slide.min.js" type="text/javascript"></script>
    <!-- END: load jquery -->
    <script src="${pageContext.request.contextPath }/js/pretty-photo/jquery.prettyPhoto.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/setup.js" type="text/javascript"></script>
    <script type="text/javascript">

        $(document).ready(function () {
            setupPrettyPhoto();
            setupLeftMenu();
            setSidebarHeight();


        });
    </script>
    <script type="text/javascript">
        var myApp= angular.module('myApp',[])
        myApp.controller('ctrl',['$scope',function($scope){
            $scope.goods={
                    data:{'title':'这是'}
            }
        }])
    </script>
   
</head>
<body>
    <div  class="container_12">
<jsp:include page="/page/front/fronthead.jsp"></jsp:include>
 <div class="clear"> </div>      
 <jsp:include page="/page/front/menu.jsp"></jsp:include>
<div class="grid_10">
            <div class="box round first">
                    <h2>Gallery</h2>
                    <div class="block">
                    <ul class="prettygallery clearfix">
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item1-full.jpg" rel="prettyPhoto[gallery2]"
                            title="">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item1.jpg" alt="This is a pretty long title" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item2-full.jpg" rel="prettyPhoto[gallery2]"
                            title="Description on a single line.">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item2.jpg"  alt="" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item3-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item3.jpg"  alt="" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item4-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item4.jpg"  alt="" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item5-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item5.jpg"  alt="" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item6-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item6.jpg"  alt="" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item7-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item7.jpg"  alt="" /></a></li>
                            
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item8-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item8.jpg"  alt="" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item9-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item9.jpg"  alt="" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item10-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item10.jpg"  alt="" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item11-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item11.jpg"  alt="" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item12-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item12.jpg"  alt="" /></a></li>
                            
                        <li><a href="${pageContext.request.contextPath }/img/pretty-photo/fullscreen/item13-full.png" rel="prettyPhoto[gallery2]">
                            <img src="${pageContext.request.contextPath }/img/pretty-photo/thumbnails/item13.jpg"  alt="" /></a></li>
                            
                    </ul>
                </div>
            </div>
        </div>
        <div class="clear">
        </div>
    </div>
    <div class="clear">
    </div>
    <div id="site_info">
        <p>
            Copyright <a href="${pageContext.request.contextPath }/#">BlueWhale Admin</a>. All Rights Reserved.More Templates <a href="${pageContext.request.contextPath }/http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="${pageContext.request.contextPath }/http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
        </p>
    </div>
</body>
</html>
