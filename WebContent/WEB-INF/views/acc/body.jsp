<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="direct">
		<div class="direct-a">
			<a>Trang chủ &#160;</a> <a>> &#160;</a> <a>Tài khoản</a>
		</div>
	</div>
	<div class="content">
		<div class="content-detail">
			<h2>Đăng nhập</h2>
			<p class="before-login-text">Chào mừng bạn đã quay trở lại !</p>
			<form class="woocommerce-form woocommerce-form-login login" action="dangnhap" method="post">
				<br>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Địa chỉ email hoặc số điện
						thoại&nbsp;<span class="required">*</span>
					</label><br> <input type="text"
						class="woocommerce-Input woocommerce-Input--text input-text"
						name="id" id="username" autocomplete="username" value="">
				</p>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="password">Mật khẩu&nbsp;<span class="required">*</span></label><br>
					<input class="woocommerce-Input woocommerce-Input--text input-text"
						type="password" name="pa" id="password"
						autocomplete="current-password">
				</p>
				<p style="color:red;">${LoginLog}</p>
				<div class="funtion">
					<button onclick="dangnhap" name="dangnhap">Đăng nhập</button>
					<br> <br>
				</div>
				<div class="funtion2">
					<div class="check">
						<input type="checkbox" name="remember"><a>Nhớ mật khẩu
							?</a>
					</div>
					<br> <br>
					<p>
						<a href="#">Quên mật khẩu ?</a>
					</p>
				</div>
			</form>
		</div>

		<!-- TRANG ĐĂNG KÍ -->
		<!-- TRANG ĐĂNG KÍ -->
		<!-- TRANG ĐĂNG KÍ -->
		<!-- TRANG ĐĂNG KÍ -->
		<!-- TRANG ĐĂNG KÍ -->

		<div class="content-detail">
			<h2>Đăng kí</h2>
			<p class="before-login-text">Tạo một tài khoản mới !</p>
			<form class="woocommerce-form woocommerce-form-login login"
			action="dangki"
				method="post">
				<br>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Họ tên &nbsp;<span class="required">*</span></label><br>
					<input type="text"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Từ 5-50 kí tự..."
						name="hoten" id="username" autocomplete="username" >
				</p>
				<p style="color:red;">${hoten}</p>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Địa chỉ email &nbsp;<span
						class="required">*</span></label><br> <input type="email"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Ví dụ:abc@gmail.com ..."
						name="email" id="username" autocomplete="email">
				</p>
				<p style="color:red;">${email}</p>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="password">Số điện thoại&nbsp;<span
						class="required">*</span></label><br> <input
						class="woocommerce-Input woocommerce-Input--text input-text"
						type="number" name="sdt" id="password" placeholder="Từ 9-10 kí tự..."
						 pattern="[0-9]{9,10}" autocomplete="phone" >
				</p>
				<p style="color:red;">${sdt}</p>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Số CMND &nbsp;<span class="required">*</span></label><br>
					<input type="number"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Từ 9-12 kí tự..."
						name="cmnd" id="username" value="" autocomplete="id" >
				</p>
				<p style="color:red;">${cmnd}</p>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Địa chỉ &nbsp;<span class="required">*</span></label><br>
					<input type="text"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Từ 0-100 kí tự..."
						name="diachi" id="username"   autocomplete="add" >
				</p>
				<p style="color:red;">${diachi}</p>
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
				<p style="color:red;">${mk}</p>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Xác nhận mật khẩu &nbsp;<span class="required">*</span></label><br>
					<input type="password"
						class="woocommerce-Input woocommerce-Input--text input-text"
						name="xnmk" id="username" autocomplete="passwords" value="">
				</p>
				<p style="color:red;">${xnmk}</p>
				<br>
				<div class="funtion">
					<button onclick="dangki" name="dangki">Đăng kí</button>

					<br> <br>
				</div>

			</form>

		</div>
	</div>
	<div class="end"></div>
</body>
</html>