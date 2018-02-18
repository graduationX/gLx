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
    <title>Typography | BlueWhale Admin</title>
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/reset.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/text.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/grid.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/layout.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/nav.css" media="screen" />
    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/ie6.css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/ie.css" media="screen" /><![endif]-->
    <!-- BEGIN: load jquery -->
    <script src="${pageContext.request.contextPath }/js/jquery-1.6.4.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.core.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.widget.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.accordion.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.effects.core.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.effects.slide.min.js" type="text/javascript"></script>
    <!-- END: load jquery -->
    <!-- BEGIN: load jqplot -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/jquery.jqplot.min.css" />
    <!--[if lt IE 9]><script language="javascript" type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/excanvas.min.js"></script><![endif]-->
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/jquery.jqplot.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/plugins/jqplot.canvasTextRenderer.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/plugins/jqplot.canvasAxisLabelRenderer.min.js"></script>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/plugins/jqplot.barRenderer.min.js"></script>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/plugins/jqplot.pieRenderer.min.js"></script>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/plugins/jqplot.categoryAxisRenderer.min.js"></script>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/plugins/jqplot.highlighter.min.js"></script>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/plugins/jqplot.pointLabels.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/plugins/jqplot.donutRenderer.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jqPlot/plugins/jqplot.bubbleRenderer.min.js"></script>
    <!-- END: load jqplot -->
    <script src="${pageContext.request.contextPath }/js/setup.js" type="text/javascript"></script>
  <script type="text/javascript">

        $(document).ready(function () {
            setupLeftMenu();

                    setSidebarHeight();
        });
    </script>

</head>
<body>
    <div class="container_12">
<jsp:include page="/page/front/fronthead.jsp"></jsp:include>
 <div class="clear"> </div>      
 <jsp:include page="/page/front/menu.jsp"></jsp:include>
            <div class="box round first">
                <h2>开头</h2>
                
                <div class="block">
            
                            <div class="message info">
                                <h5>我</h5>
                                <p>
                                    This is an info message.
                                </p>
                            </div>
                            <div class="message success">
                                <h5>听见</h5>
                                <p>
                                    This is a success message.
                                </p>
                            </div>
                            <div class="message warning">
                                <h5>雨滴</h5>
                                <p>
                                    This is a warning message.
                                </p>
                            </div>
                            <div class="message error">
                                <h5>罗</h5>
                                <p>
                                    This is an error message.
                                </p>
                            </div>
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
