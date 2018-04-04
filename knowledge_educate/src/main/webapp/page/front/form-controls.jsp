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
    <title>Form Controls | BlueWhale Admin</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/reset.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/text.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/grid.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/layout.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/nav.css" media="screen" />
    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/ie6.css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/ie.css" media="screen" /><![endif]-->
    <link href="${pageContext.request.contextPath }/css/fancy-button/fancy-button.css" rel="stylesheet" type="text/css" />
    <!--Jquery UI CSS-->
    <link href="${pageContext.request.contextPath }/css/themes/base/jquery.ui.all.css" rel="stylesheet" type="text/css" />
    <!-- BEGIN: load jquery -->
    <script src="${pageContext.request.contextPath }/js/jquery-1.6.4.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.core.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.widget.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.accordion.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.effects.core.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.effects.slide.min.js" type="text/javascript"></script>
    <!-- END: load jquery -->
    <!--jQuery Date Picker-->
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.widget.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.datepicker.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.progressbar.min.js" type="text/javascript"></script>
    <!-- jQuery dialog related-->
    <script src="${pageContext.request.contextPath }/js/jquery-ui/external/jquery.bgiframe-2.1.2.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.mouse.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.draggable.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.position.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.resizable.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.dialog.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.effects.core.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.effects.blind.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.effects.explode.min.js" type="text/javascript"></script>
    <!-- jQuery dialog end here-->
    <script src="${pageContext.request.contextPath }/js/jquery-ui/jquery.ui.accordion.min.js" type="text/javascript"></script>
    <!--Fancy Button-->
    <script src="${pageContext.request.contextPath }/js/fancy-button/fancy-button.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/setup.js" type="text/javascript"></script>
    <!-- Load TinyMCE -->	
   	<script src="${pageContext.request.contextPath }/js/tiny-mce/jquery.tinymce.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            setupTinyMCE();
            setupProgressbar('progress-bar');
            setDatePicker('date-picker');
            setupDialogBox('dialog', 'opener');
            $('input[type="checkbox"]').fancybutton();
            $('input[type="radio"]').fancybutton();
        });
    </script>
    <!-- /TinyMCE -->
    <style type="text/css">
        #progress-bar
        {
            width: 400px;
        }
    </style>
</head>
<body>
    <div class="container_12">
         <jsp:include page="/page/front/fronthead.jsp"></jsp:include>
        <div class="clear">
        </div>
        <div class="grid_12">
            <div class="box round first fullpage">
                <h2>
                    Form Controls</h2>
                <div class="block ">
                    <form>
                    <table class="form">
                        <tr>
                            <td class="col1">
                                <label>
                                    Normal Input</label>
                            </td>
                            <td class="col2">
                                <input type="text" id="grumble" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Small Input</label>
                            </td>
                            <td>
                                <input type="text" class="mini" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Medium Sized Input</label>
                            </td>
                            <td>
                                <input type="text" class="medium" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Large Input</label>
                            </td>
                            <td>
                                <input type="text" class="large" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Error</label>
                            </td>
                            <td>
                                <input type="text" class="error" />
                                <span class="error">This is a required field.</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Success</label>
                            </td>
                            <td>
                                <input type="text" class="success" />
                                <span class="success">Email address verfified.</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Warning</label>
                            </td>
                            <td>
                                <input type="text" class="warning" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="error">
                                    Label Error</label>
                            </td>
                            <td>
                                <input type="text" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Checkboxes</label>
                            </td>
                            <td>
                                <input type="checkbox" />Checkbox 1
                                <input type="checkbox" />Checkbox 2
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Radio Buttons</label>
                            </td>
                            <td>
                                <input type="radio" name="rd1" />
                                Male
                                <input type="radio" name="rd1" />
                                Female
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Select</label>
                            </td>
                            <td>
                                <select id="select" name="select">
                                    <option value="1">Value 1</option>
                                    <option value="2">Value 2</option>
                                    <option value="3">Value 3</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Progress Bar</label>
                            </td>
                            <td>
                                <div id="progress-bar">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Dialog Box</label>
                            </td>
                            <td>
                                <div id="dialog" title="Basic dialog">
                                    <p>
                                        This is an animated dialog which is useful for displaying information. The dialog
                                        window can be moved, resized and closed with the 'x' icon.</p>
                                </div>
                                <button id="opener">
                                    Open Dialog</button>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Date Picker</label>
                            </td>
                            <td>
                                <input type="text" id="date-picker" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>
                                    Attach File</label>
                            </td>
                            <td>
                                <input type="file" />
                            </td>
                        </tr>
                        <tr>
                            <td style="vertical-align: top; padding-top: 9px;">
                                <label>
                                    WYSIWYG Editor</label>
                            </td>
                            <td>
                                <textarea class="tinymce"></textarea>
                            </td>
                        </tr>
                    </table>
                    </form>
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
