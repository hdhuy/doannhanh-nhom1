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
				<a class="navbar-brand" href="index.html">Lung Thị Linh</a>
			</div>
			<div
				style="color: white; padding: 15px 50px 5px 50px; float: right; font-size: 16px;">
				3/12/2019 &nbsp; <a href="#"
					class="btn btn-danger square-btn-adjust">Đăng xuất</a>
			</div>
		</nav>
		<!-- /. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="main-menu">
					<li class="text-center"><img src="assets/imgAd/find_user.png"
						class="user-image img-responsive" /></li>

					<li><a class="active-menu" href="index.html"><i
							class="fas fa-bell fa-3x"></i>Thông báo</a></li>
					<li><a class="active-menu" href="index.html"><i
							class="fas fa-hand-holding-usd fa-3x"></i>Doanh Thu</a></li>
					<li><a href="#"><i class="fas fa-warehouse fa-3x"></i> Kho
							hàng<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#">Xem kho hàng</a></li>
							<li><a href="#">Nhập xuất</a></li>
							<li><a href="#">Lịch sử kho</a></li>
							<li><a href="#">Nguyên liệu</a></li>
						</ul></li>
					<li><a href="#"><i class="fas fa-utensils fa-3x"></i> Món ăn<span
							class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#">Quản lí món ăn</a></li>
							<li><a href="#">Thêm món ăn</a></li>
						</ul></li>
					
					<li><a href="#"><i class="fas fa-money-bill fa-3x"></i> Đơn
							hàng<span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#">Xem đơn hàng</a></li>
							<li><a href="#">Đơn cần duyệt</a></li>
						</ul></li>
					<li><a href="#"><i class="far fa-user fa-3x"></i> Thành
							viên <span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="#">Quản lí thành viên</a></li>
							<li><a href="#">Thêm thành viên</a></li>
							<li><a href="#">Phân quyền</a></li>
						</ul></li>
				</ul>

			</div>

		</nav>
		<!-- /. NAV SIDE  -->
		<jsp:include page="admin/themthanhvien.jsp"></jsp:include>
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
