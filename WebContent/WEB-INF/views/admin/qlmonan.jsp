<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="page-wrapper">
		<div id="page-inner">
			<div class="sbar">
				<input type="text" id="mySearch" style="padding-left: 1px;"
					name="txtTk" value="${st}" placeholder="Tìm kiếm..."
					title="Type in a category">
				<button onclick="admin" name="timmon">Tìm</button>
				<ul id="myMenu">
					<c:forEach items="${list}" var="item">
						<li><button onclick="admin" name="chontv">${item.getMaMonAn()}</button>
						Tên món: ${item.gettenMonAn()} || Loại món:${item.getLoaiSanPham()}</li>

					</c:forEach>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>