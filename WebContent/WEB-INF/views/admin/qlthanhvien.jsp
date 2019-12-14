<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="assets/css/admin/qltv.css">
</head>
<body>
	<div id="page-wrapper">
	<form action="admin" method="post">
		<div id="page-inner">
			<p>${message}</p>
			<div class="qltv">
			<div class="sbar">
				<input type="text" id="mySearch" style="padding-left: 1px;" name="txtTk" value="${st}"
					placeholder="Tìm kiếm..." title="Type in a category"><button onclick="admin" name="tktv">Tìm</button>
				<ul id="myMenu">
				<c:forEach items="${list}" var="item">
					<li><button onclick="admin" name="chontv">${item.getEmail()}</button>Họ tên: ${item.getHoTen()} || Số điện thoại: ${item.getSoDienThoai()}
					
					</li>
					
				</c:forEach>
				</ul>
				</div>
				
		<div class="content-detail">
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Họ tên &nbsp;<span class="required">*</span></label><br>
					<input type="text" value="${tv.getHoTen()}"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Từ 5-50 kí tự..."
						name="hoten" id="username" autocomplete="username" >
				</p>
				<a style="color:red;">${hoten}</a>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Địa chỉ email &nbsp;<span
						class="required">*</span></label><br> <input type="email" value="${tv.getEmail()}"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Ví dụ:abc@gmail.com ..."
						name="email" id="username" autocomplete="email">
				</p>
				<a style="color:red;">${email}</a>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="password">Số điện thoại&nbsp;<span
						class="required">*</span></label><br> <input value="${tv.getSoDienThoai()}"
						class="woocommerce-Input woocommerce-Input--text input-text"
						type="number" name="sdt" id="password" placeholder="Từ 9-10 kí tự..."
						 pattern="[0-9]{9,10}" autocomplete="phone" >
				</p>
				<a style="color:red;">${sdt}</a>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Số CMND &nbsp;<span class="required">*</span></label><br>
					<input type="number" value="${tv.getCMND()}"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Từ 9-12 kí tự..."
						name="cmnd" id="username" value="" autocomplete="id" >
				</p>
				<a style="color:red;">${cmnd}</a>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Địa chỉ &nbsp;<span class="required">*</span></label><br>
					<input type="text" value="${tv.getDiaChi()}"
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
					<input type="date" value="${tv.getNgaySinh()}"
						class="woocommerce-Input woocommerce-Input--text input-text"
						name="ns" id="username" value="">
				</p>
				<p
					class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
					<label for="username">Mật khẩu &nbsp;<span class="required">*</span></label><br>
					<input type="text" value="${tv.getMatKhau()}"
						class="woocommerce-Input woocommerce-Input--text input-text" placeholder="Từ 5-20 kí tự..."
						name="mk" id="username" autocomplete="passwords" >
				</p>
				<a style="color:red;">${mk}</a>
				
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
		<div class="content-detail">
		<div class="funtion">
					<button onclick="admin" name="ttv">Cập nhật</button>
					<button onclick="admin" name="ttv">Xóa</button>
					<button onclick="admin" name="ttv">Khóa</button>
					<button onclick="admin" name="ttv">Mở</button>
					<br> <br>
				</div>
				</div>
				</form>
			</div>
			
		</div>
		</form>
	</div>
	<script>

</script>
</body>
</html>