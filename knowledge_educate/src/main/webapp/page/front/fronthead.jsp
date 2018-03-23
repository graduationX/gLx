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
    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/${pageContext.request.contextPath }/css/ie6.css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/${pageContext.request.contextPath }/css/ie.css" media="screen" /><![endif]-->
    <!-- BEGIN: load jquery -->
 
   
</head>
<body>
    <div class="grid_12 header-repeat">
            <div id="branding">
                <div class="floatleft">
                    <img src="${pageContext.request.contextPath }/img/logo.png" alt="Logo" /></div>
                <div class="floatright">
                    <div class="floatleft">
                        <img src="${pageContext.request.contextPath }/img/img-profile.jpg" alt="Profile Pic" /></div>
                    <div class="floatleft marginleft10">
                        <ul class="inline-ul floatleft">
                            <li>Hello Admin</li>
                            <li><a href="${pageContext.request.contextPath }/#">Config</a></li>
                            <li><a href="${pageContext.request.contextPath }/logout.action">Logout</a></li>
                        </ul>
                        <br />
                        <span class="small grey">Last Login: 3 hours ago</span>
                    </div>
                </div>
                <div class="clear">
                </div>
            </div>
        </div>
        <div class="clear">
        </div>
        <div class="grid_12">
            <ul class="nav main">
                <li class="ic-dashboard"><a href="${pageContext.request.contextPath }/page/front/dashboard.jsp"><span>Dashboard</span></a> </li>
                <li class="ic-form-style"><a href="javascript:void(0)"><span>Controls</span></a>
                    <ul>
                        <li><a href="${pageContext.request.contextPath }/page/front/form-controls.jsp">Forms</a> </li>
                        <li><a href="${pageContext.request.contextPath }/page/front/buttons.jsp">Buttons</a> </li>
                        <li><a href="${pageContext.request.contextPath }/page/front/form-controls.jsp">Full Page Example</a> </li>
                        <li><a href="${pageContext.request.contextPath }/page/front/table.jsp">Page with Sidebar Example</a> </li>
                    </ul>
                </li>
                <li class="ic-typography"><a href="${pageContext.request.contextPath }/page/front/typography.jsp"><span>Typography</span></a></li>
                <li class="ic-charts"><a href="${pageContext.request.contextPath }/page/front/charts.jsp"><span>Charts & Graphs</span></a></li>
                <li class="ic-grid-tables"><a href="${pageContext.request.contextPath }/page/front/table.jsp"><span>Data Table</span></a></li>
                <li class="ic-gallery dd"><a href="javascript:"><span>Image Galleries</span></a>
                     <ul>
                        <li><a href="${pageContext.request.contextPath }/page/front/image-gallery.jsp">Pretty Photo</a> </li>
                        <li><a href="${pageContext.request.contextPath }/page/front/gallery-with-filter.jsp">Gallery with Filter</a> </li>
                    </ul>
                </li>
                <li class="ic-notifications"><a href="${pageContext.request.contextPath }/page/front/notifications.jsp"><span>Notifications</span></a></li>

            </ul>
        </div>
</body>
</html>
