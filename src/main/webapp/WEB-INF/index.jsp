<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@include file="../common/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>erp首页</title>
 <link rel="shortcut icon" href="favicon.ico"> <link href="${ctx }/resources/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${ctx }/resources/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${ctx }/resources/css/animate.css" rel="stylesheet">
    <link href="${ctx }/resources/css/style.css?v=4.1.0" rel="stylesheet">
</head>

<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
    <div id="wrapper">
        <!--左侧导航开始-->
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="nav-close"><i class="fa fa-times-circle"></i>
            </div>
            <div class="sidebar-collapse">
                <ul class="nav" id="side-menu">
                    <li class="nav-header">
                        <div class="dropdown profile-element">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear">
                                    <span class="block m-t-xs" style="font-size:20px;">
                                        <i class="fa fa-area-chart"></i>
                                        <strong class="font-bold">仓库管理</strong>
                                    </span>
                                </span>
                            </a>
                        </div>
                        <div class="logo-element"> 仓库管理
                        </div>
                    </li>
                    
                    <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                        <span class="ng-scope">欢迎使用</span>
                    </li>
                    <li>
                        <a class="J_menuItem" href="${ctx }/resource">
                            <i class="fa fa-home"></i>
                            <span class="nav-label">主页</span>
                        </a>
                    </li>
                    <li class="line dk"></li>
                    <!-- 库房管理 -->
                    <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                        <span class="ng-scope">库房</span>
                    </li>
                    <li>
                        <a href="#">
                            <i class="fa fa fa-bar-chart-o"></i>
                            <span class="nav-label">库房管理</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a class="J_menuItem" href="graph_echarts.html">添加仓库</a>
                            </li>
                            <li>
                                <a class="J_menuItem" href="graph_flot.html">查找仓库</a>
                            </li>
                            <li>
                                <a class="J_menuItem" href="graph_morris.html">修改仓库</a>
                            </li>
                            
                        </ul>
                    </li>
                    <li class="line dk"></li>
                 <!--产品管理  -->   
                    <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                        <span class="ng-scope">产品</span>
                    </li>
                    <li>
                        <a href="mailbox.html"><i class="fa fa-envelope"></i> <span class="nav-label">产品管理 </span><span class="fa arrow"></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="mailbox.html">添加产品</a>
                            </li>
                            <li><a class="J_menuItem" href="mail_detail.html">修改产品</a>
                            </li>
                            <li><a class="J_menuItem" href="mail_compose.html">查找产品</a>
                            </li>
                        </ul>
                    </li>
                    <li class="line dk"></li>
                    
                    <!-- 订单管理 -->
                    <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                        <span class="ng-scope">订单</span>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-table"></i> <span class="nav-label">订单管理</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="table_basic.html">查找订单</a>
                            </li>
                            <li><a class="J_menuItem" href="table_data_tables.html">修改订单</a>
                            </li>
                            
                        </ul>
                    </li>
                    <li class="line dk"></li>
                    
                    <!-- 财务管理 -->
                    <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                        <span class="ng-scope">财务</span>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-desktop"></i> <span class="nav-label">财务管理</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="basic_gallery.html">财务</a>
                            </li>
                            <li><a class="J_menuItem" href="carousel.html">财务</a>
                            </li>
                            <li><a class="J_menuItem" href="blueimp.html">财务</a>
                            </li>
                        </ul>
                    </li>
                    <li class="line dk"></li>
                    <!-- 客户管理  -->
                    <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                        <span class="ng-scope">客户</span>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-desktop"></i> <span class="nav-label">客户管理</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="basic_gallery.html">查找客户</a>
                            </li>
                            <li><a class="J_menuItem" href="carousel.html">添加客户</a>
                            </li>
                            <li><a class="J_menuItem" href="blueimp.html">修改客户</a>
                            </li>
                        </ul>
                    </li>
                    <li class="line dk"></li>
                    
                    <!-- 员工管理  -->
                    <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                        <span class="ng-scope">员工</span>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-desktop"></i> <span class="nav-label">员工管理</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="basic_gallery.html">查找员工</a>
                            </li>
                            <li><a class="J_menuItem" href="carousel.html">修改员工</a>
                            </li>
                            <li><a class="J_menuItem" href="blueimp.html">注销员工</a>
                            </li>
                        </ul>
                    </li>
                </ul>
         </nav>
        <!--左侧导航结束-->
        <!--右侧部分开始-->
        <div id="page-wrapper" class="gray-bg dashbard-1">
            <div class="row border-bottom">
                <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                    <div class="navbar-header"><a class="navbar-minimalize minimalize-styl-2 btn btn-info " href="#"><i class="fa fa-bars"></i> </a>
                        <form role="search" class="navbar-form-custom" method="post" action="search_results.html">
                            <div class="form-group">
                                <input type="text" placeholder="请输入您需要查找的内容 …" class="form-control" name="top-search" id="top-search">
                            </div>
                        </form>
                    </div>
                </nav>
            </div>
            <div class="row J_mainContent" id="content-main">
                <iframe id="J_iframe" width="100%" height="100%" src="index_v1.html?v=4.0" frameborder="0" data-id="index_v1.html" seamless></iframe>
            </div>
        </div>
        <!--右侧部分结束-->
    </div>

    <!-- 全局js -->
    <script src="${ctx }/resources/js/jquery.min.js?v=2.1.4"></script>
    <script src="${ctx }/resources/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${ctx }/resources/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="${ctx }/resources/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="${ctx }/resources/js/plugins/layer/layer.min.js"></script>

    <!-- 自定义js -->
    <script src="${ctx }/resources/js/hAdmin.js?v=4.1.0"></script>
    <script type="text/javascript" src="${ctx }/resources/js/index.js"></script>

    <!-- 第三方插件 -->
    <script src="${ctx }/resources/js/plugins/pace/pace.min.js"></script>

</body>

</html>
