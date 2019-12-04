<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="assets/css/admin/themthanhvien.css">
</head>
<body>
<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h2>Thêm thành viên mới </h2>
						<h5>Xin chào quản trị viên Lung Thị Linh !</h5>
						<a style="color:red;">${message}</a>
					</div>
				</div>
				<!-- /. ROW  -->
				<hr />
				<div class="content">

		<!-- TRANG ĐĂNG KÍ -->
		<!-- TRANG ĐĂNG KÍ -->
		<!-- TRANG ĐĂNG KÍ -->
		<!-- TRANG ĐĂNG KÍ -->
		<!-- TRANG ĐĂNG KÍ -->
		<form action="themthanhvien" method="post">
		<div class="content-detail">
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Họ tên &nbsp;<span class="required">*</span></label>
					<input type="text"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Từ 5-50 kí tự..."
						name="hoten" id="username" autocomplete="username" >
				</p>
				<a style="color:red;">${hoten}</a>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Địa chỉ email &nbsp;<span
						class="required">*</span></label><br> <input type="email"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Ví dụ:abc@gmail.com ..."
						name="email" id="username" autocomplete="email">
				</p>
				<a style="color:red;">${email}</a>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="password">Số điện thoại&nbsp;<span
						class="required">*</span></label><br> <input
						class="woocommerce-Input woocommerce-Input--text input-text"
						type="number" name="sdt" id="password" placeholder="Từ 9-10 kí tự..."
						 pattern="[0-9]{9,10}" autocomplete="phone" >
				</p>
				<a style="color:red;">${sdt}</a>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Số CMND &nbsp;<span class="required">*</span></label><br>
					<input type="number"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Từ 9-12 kí tự..."
						name="cmnd" id="username" value="" autocomplete="id" >
				</p>
				<a style="color:red;">${cmnd}</a>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Địa chỉ &nbsp;<span class="required">*</span></label><br>
					<input type="text"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Từ 0-100 kí tự..."
						name="diachi" id="username"   autocomplete="add" >
				</p>
				<a style="color:red;">${diachi}</a>
				
			
		</div>
		<div class="content-detail">
		<p></p>
				<label for="username">Giới tính &nbsp;<span class="required">*</span></label>
				<div class="gt">
					<select name="gioitinh">
						<option>Nam</option>
						<option selected>Nữ</option>
					</select>
				</div>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Ngày sinh&nbsp;<span class="required">*</span></label><br>
					<input type="date"
						class="woocommerce-Input woocommerce-Input--text input-text"
						name="ns" id="username" value="">
				</p>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Mật khẩu &nbsp;<span class="required">*</span></label><br>
					<input type="password"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Từ 5-20 kí tự..."
						name="mk" id="username" autocomplete="passwords" >
				</p>
				<a style="color:red;">${mk}</a>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Xác nhận mật khẩu &nbsp;<span class="required">*</span></label><br>
					<input type="password"
						class="woocommerce-Input woocommerce-Input--text input-text"
						name="xnmk" id="username" autocomplete="passwords" value="">
				</p>
				<br>
				<a style="color:red;">${xnmk}</a>
				<label for="username">Phân quyền &nbsp;<span class="required">*</span></label>
				<br>
				<div class="gt">
					<select name="chucvu">
						<option selected>Khách hàng</option>
						<option>Nhân viên</option>
						<option>Quản trị viên</option>
					</select>
				</div>
				
		</div>
		<div class="funtion">
					<button onclick="themthanhvien" name="themthanhvien">Thêm thành viên</button>

					<br> <br>
				</div>
				</form>
	</div>
				<!-- /. ROW  -->
			</div>
			<!-- /. PAGE INNER  -->
		</div>
</body>
</html>