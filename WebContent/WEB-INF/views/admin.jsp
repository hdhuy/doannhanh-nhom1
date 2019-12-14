<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Quản trị viên</title>
<!-- BOOTSTRAP STYLES-->
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link href="assets/css/font-awesome.css" rel="stylesheet" />
<link href="assets/css/font-awesome.min.css" rel="stylesheet" />
<!-- MORRIS CHART STYLES-->
<link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
<!-- CUSTOM STYLES-->
<link href="assets/css/custom.css" rel="stylesheet" />
<!-- GOOGLE FONTS-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
	
	
</head>
<body>
	<div id="wrapper">
		<nav class="navbar navbar-default navbar-cls-top " role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".sidebar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">Vu Duc Trung</a>
			</div>
			<div
				style="color: white; padding: 15px 50px 5px 50px; float: right; font-size: 16px;">
				3/12/2019 &nbsp; <a href="#"
					class="btn btn-danger square-btn-adjust">Đăng xuất</a>
			</div>
		</nav>
		<!-- /. NAV TOP  -->
		<form action="admin" method="post">
		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">
					<li class="text-center"><img src="assets/imgAd/find_user.png"
						class="user-image img-responsive" /></li>

					<li><a href="admin" name="thongbao"><i
							class="fas fa-bell fa-3x"></i>Thông báo</a></li>
					<li><button onclick="admin" name="doanhthu" style="padding-left: 20px;"><i
							class="fas fa-hand-holding-usd fa-3x"></i>Doanh Thu</button></li>
					<li><a href="#"><i class="fas fa-warehouse fa-3x"></i> Kho
							hàng<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><button onclick="admin" name="qlkhohang">Quản lí kho hàng</button></li>
							<li><button onclick="admin" name="nhap">Nhập nguyên liệu</button></li>
							<li><button onclick="admin" name="xuat">Xuất nguyên liệu</button></li>
							<li><button onclick="admin" name="lichsukho">Lịch sử kho</button></li>
							<li><button onclick="admin" name="nguyenlieu">Nguyên liệu</button></li>
						</ul></li>
					<li><a href="#"><i class="fas fa-utensils fa-3x"></i> Món ăn<span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><button onclick="admin" name="qlmonan">Quản lí món ăn</button></li>
							<li><button onclick="admin" name="themmonan">Thêm món ăn</button></li>
						</ul></li>
					
					<li><button onclick="admin" name="donhang"><i class="fas fa-money-bill fa-3x"></i><a> Đơn
							hàng</a></button>
						
						
					<li><a href="#"><i class="far fa-user fa-3x"></i> Thành
							viên <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><button onclick="admin" name="qlthanhvien">Quản lí thành viên</button></li>
							<li><button onclick="admin" name="themthanhvien">Thêm thành viên</button></li>
						</ul></li>
				</ul>			</div>

		</nav>
		</form>
		<!-- /. NAV SIDE  -->
		
		<jsp:include page="admin/${include}.jsp"></jsp:include>
		
		
		<!-- /. PAGE WRAPPER  -->
	</div>
	<!-- /. WRAPPER  -->
	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
	<!-- JQUERY SCRIPTS -->
	<script src="assets/js/jquery-1.10.2.js"></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src="assets/js/bootstrap.min.js"></script>
	<!-- METISMENU SCRIPTS -->
	<script src="assets/js/jquery.metisMenu.js"></script>
	<!-- MORRIS CHART SCRIPTS -->
	<script src="assets/js/morris/raphael-2.1.0.min.js"></script>
	<script src="assets/js/morris/morris.js"></script>
	<!-- CUSTOM SCRIPTS -->
	<script src="assets/js/custom.js"></script>
	<script src="https://kit.fontawesome.com/d0f6a4c68e.js" crossorigin="anonymous"></script>

</body>
</html>
