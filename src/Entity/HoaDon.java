package Entity;

import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name = "HoaDon")
public class HoaDon {
	@Id
	@GeneratedValue
	int MaDonHang;
	String DonViVanChuyen;
	int PhiVanChuyen;
	int SoSanPham;
	int Gia;
	int TongTien;
	int LoiNhuan;
	int MaThanhVien;
	String DiaChi;
	String SoDienThoai;
	String CMND;
	String MoTa;
	Date NgayMua;
	String TrangThai;
	
	public HoaDon() {
		
	}
	
	public HoaDon(int maDonHang, String donViVanChuyen, int phiVanChuyen, int soSanPham, int gia, int tongTien,
			int loiNhuan, int maThanhVien, String diaChi, String soDienThoai, String cMND, String moTa, Date ngayMua,
			String trangThai) {
		MaDonHang = maDonHang;
		DonViVanChuyen = donViVanChuyen;
		PhiVanChuyen = phiVanChuyen;
		SoSanPham = soSanPham;
		Gia = gia;
		TongTien = tongTien;
		LoiNhuan = loiNhuan;
		MaThanhVien = maThanhVien;
		DiaChi = diaChi;
		SoDienThoai = soDienThoai;
		CMND = cMND;
		MoTa = moTa;
		NgayMua = ngayMua;
		TrangThai = trangThai;
	}

	public int getMaDonHang() {
		return MaDonHang;
	}

	public void setMaDonHang(int maDonHang) {
		MaDonHang = maDonHang;
	}

	public String getDonViVanChuyen() {
		return DonViVanChuyen;
	}

	public void setDonViVanChuyen(String donViVanChuyen) {
		DonViVanChuyen = donViVanChuyen;
	}

	public int getPhiVanChuyen() {
		return PhiVanChuyen;
	}

	public void setPhiVanChuyen(int phiVanChuyen) {
		PhiVanChuyen = phiVanChuyen;
	}

	public int getSoSanPham() {
		return SoSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		SoSanPham = soSanPham;
	}

	public int getGia() {
		return Gia;
	}

	public void setGia(int gia) {
		Gia = gia;
	}

	public int getTongTien() {
		return TongTien;
	}

	public void setTongTien(int tongTien) {
		TongTien = tongTien;
	}

	public int getLoiNhuan() {
		return LoiNhuan;
	}

	public void setLoiNhuan(int loiNhuan) {
		LoiNhuan = loiNhuan;
	}

	public int getMaThanhVien() {
		return MaThanhVien;
	}

	public void setMaThanhVien(int maThanhVien) {
		MaThanhVien = maThanhVien;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public String getMoTa() {
		return MoTa;
	}

	public void setMoTa(String moTa) {
		MoTa = moTa;
	}

	public Date getNgayMua() {
		return NgayMua;
	}

	public void setNgayMua(Date ngayMua) {
		NgayMua = ngayMua;
	}

	public String getTrangThai() {
		return TrangThai;
	}

	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
	
	
}
