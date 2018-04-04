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
    <link rel="stylesheet" type="text/css" href="css/reset.css" media="screen" />
     <link rel="stylesheet" type="text/css" href="css/ngcloak.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="css/text.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="css/grid.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="css/layout.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="css/nav.css" media="screen" />
    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="css/ie.css" media="screen" /><![endif]-->
    <link href="css/table/demo_page.css" rel="stylesheet" type="text/css" />
    <!-- BEGIN: load jquery -->
    <script src="js/jquery-1.6.4.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/jquery-ui/jquery.ui.core.min.js"></script>
    <script src="js/jquery-ui/jquery.ui.widget.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui/jquery.ui.accordion.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui/jquery.effects.core.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui/jquery.effects.slide.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui/jquery.ui.mouse.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui/jquery.ui.sortable.min.js" type="text/javascript"></script>
    <script src="js/table/jquery.dataTables.min.js" type="text/javascript"></script>
    <!-- END: load jquery -->
<!--     <script src="js/angular.min.js" type="text/javascript"></script> -->
	<script src="js/angular-1.5.8/angular.min.js" type="text/javascript"></script>
    <script src="js/setup.js" type="text/javascript"></script>
    
    <style >
    	.ng-cloak{
    	display: none;
    	}
    </style>
    <script type="text/javascript">
    	
    </script>
 
                   
</head>

<body  ng-app="lm" ng-controller="linctrl" >
    <div   class="container_12" >
      <jsp:include page="/page/front/fronthead.jsp"></jsp:include>
        <div class="clear"> </div>
      <jsp:include page="/page/front/menu.jsp"></jsp:include>
        <div class="grid_10">
            <div class="box round first grid">
                <h2>
                    学生信息</h2>
                <div class="block">
                    <table class="data display datatable" id="example">
					<thead>
						<tr >
							<th>学号</th>
							<th>姓名</th>
							<th>性别</th>
							<th>出生年月</th>
							<th>班级</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody  ng-cloak calss="ng-cloak">
						<tr ng-repeat="v in data.list" class="odd gradeX">
							<td>{{v.sid}}</td>
							<td>{{v.sname}}</td>
							<td>{{v.ssex}}</td>
							<!-- <td ng-if="v.ssex == １">女</td> -->
							<td class="center">{{v.birth|date:'yyyy-MM-dd'}}</td>
							<td class="center"><span ng-bind="v.sclass"></span></td>
							<td><input id="updateo" type="submit" value="修改" /></td>
						</tr>
						
					</tbody>
				</table>
                </div>
                <div>
                <span ><input type="submit" value="上一页" ng-click="nextPage()" /> <button ng-click="fn1()">点击执行</button> <input type="submit" value="下一页" /></span>
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
            Copyright <a href="#">BlueWhale Admin</a>. All Rights Reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
        </p>
    </div>
    
 	<!--  <script  type="text/javascript" >
 
    	var m=angular.module('hd',[]);
    	m.controller('ctrl',['$scope',function($scope){
    		$scope.goods={
    				data:{'title':'这个'}
    		}
    	}])
    </script> -->
 <script type="text/javascript">

 var key="5-2";
 var pageNum=1;
 var pageSize=1;
 var m =angular.module('lm',[]);
  m.controller('linctrl',['$scope','$http',function($scope,$http){
	  $http({
			method:'get',
			params:{"key":key,"pageNum":pageNum,"pageSize":pageSize},
			url:'page/front/student/stulist.action'
		  }).then(function(response){
			  console.log(response);
			  $scope.data=response.data;
			  
		  },function(response){
			  
			  alert("错");
		  }); 
	  $scope.fn1 = function() {
		  pageNum=pageNum+1;
	      alert(pageNum);
	      $http.get("page/front/student/stulist.action?key="+key+"&pageNum="+2+"&pageSize="+pageSize).success(function(data){  
	    	 // v.sname=sname;//页面随着改变刷新  
	    	 //错误接口增加错误恢复日期，沟通一下处理人员
	    	  console.log(data);
	      });  
	  }
	
	
  }]);


  //解决jQuery与angular.js执行顺序问题
  m.run(function ($timeout) {//等待AngularJS加载完成之后触发事件  
      var a = $timeout(function () {
    	  setupLeftMenu();
          $('.datatable').dataTable();
    	  setSidebarHeight();
          //alert($('table tr').length);  
          $(function(){

		$("#updateo").click(function(){
			alert("s");
		 });
	 })
      }, 1000);  
  }); 
  </script>
 
  <script type="text/javascript">
  
 /*  	(function () {
	  setupLeftMenu();
      $('.datatable').dataTable();
	  setSidebarHeight();
  });  */
  
  
  
    </script>
</body>

</html>
