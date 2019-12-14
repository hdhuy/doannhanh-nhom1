<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="page-wrapper">
		<div id="page-inner">
		<form action="admin" method="post">
			<div class="funtion">
				<button>In</button><br>
				<label>Chuyển thành</label>
				<select name="chuyenthanh">
					<option>Đang chờ duyệt</option>
					<option>Đang vận chuyển</option>
					<option>Đã hoàn thành</option>
					<option>Đã bị hủy</option>
				</select>
				<button name="xnchuyen">Xác nhận chuyển</button>
				<label style="color: blue;">${noti}</label>
			</div>
			<div class="funtion">
				<label>Lọc theo ngày: </label>
				<input type="date" name="ngaybatdau">
				<input type="date" name="ngayketthuc">
				<label>Lọc theo trạng thái: </label>
				<select name="trangthai">
					<option>tat ca</option>
					<option>dang cho duyet</option>
					<option>dang van chuyen</option>
					<option>da hoan thanh</option>
					<option>da bi huy</option>
				</select>
				<button onclick="admin" name="locdonhang">Lọc</button>
				<br>
				<p style="color: red;">${message}</p>
			</div>
			<div class="table-div">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Mã đơn</th>
							<th scope="col">Mã thành viên</th>
							<th scope="col">Tổng tiền</th>
							<th scope="col">Ngày mua</th>
							<th scope="col">Ngày hoàn thành</th>
							<th scope="col">Trạng thái</th>
							<th scope="col">Đơn vị vận chuyển</th>
							<th scope="col">Chi tiết</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="item">
							<tr>
							<td><input type="checkbox" name="checkbox[]" value="${item.getMaDonHang()}"></td>
							<td>${item.getMaDonHang()}</td>
							<td>${item.getMaThanhVien()}</td>
							<td>${item.getTongTien()}</td>
							<td>${item.getNgayMua()}</td>
							<td>${item.getNgayHoanThanh()}</td>
							<td>${item.getTrangThai()}</td>
							<td>${item.getDonViVanChuyen()}</td>
							<td><button>Xem chi tiết</button></td>
						</tr>	
						</c:forEach>
					</tbody>
				</table>
			</div>
			</form>
		</div>
	</div>
</body>
</html>