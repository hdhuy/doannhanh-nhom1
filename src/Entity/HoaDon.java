package Entity;

import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name = "HoaDon")
public class HoaDon {
	@Id
	@GeneratedValue
	int MaDonHang;
	int MaThanhVien;
	int TongTien;
	int LoiNhuan;
	String HoTen;
	String CMND;
	String DiaChi;
	String SoDienThoai;
	String MoTa;
	Date NgayMua;
	Date NgayHoanThanh;
	String TrangThai;
	String DonViVanChuyen;
	
	public HoaDon() {
		
	}

	public HoaDon(int maDonHang, int maThanhVien, int tongTien, int loiNhuan, String hoTen, String cMND, String diaChi,
			String soDienThoai, String moTa, Date ngayMua, Date ngayHoanThanh, String trangThai,
			String donViVanChuyen) {
		super();
		MaDonHang = maDonHang;
		MaThanhVien = maThanhVien;
		TongTien = tongTien;
		LoiNhuan = loiNhuan;
		HoTen = hoTen;
		CMND = cMND;
		DiaChi = diaChi;
		SoDienThoai = soDienThoai;
		MoTa = moTa;
		NgayMua = ngayMua;
		NgayHoanThanh = ngayHoanThanh;
		TrangThai = trangThai;
		DonViVanChuyen = donViVanChuyen;
	}
	public HoaDon(int maThanhVien, int tongTien, int loiNhuan, String hoTen, String cMND, String diaChi,
			String soDienThoai, String moTa, Date ngayMua, Date ngayHoanThanh, String trangThai,
			String donViVanChuyen) {
		super();
		MaThanhVien = maThanhVien;
		TongTien = tongTien;
		LoiNhuan = loiNhuan;
		HoTen = hoTen;
		CMND = cMND;
		DiaChi = diaChi;
		SoDienThoai = soDienThoai;
		MoTa = moTa;
		NgayMua = ngayMua;
		NgayHoanThanh = ngayHoanThanh;
		TrangThai = trangThai;
		DonViVanChuyen = donViVanChuyen;
	}

	public int getMaDonHang() {
		return MaDonHang;
	}

	public void setMaDonHang(int maDonHang) {
		MaDonHang = maDonHang;
	}

	public int getMaThanhVien() {
		return MaThanhVien;
	}

	public void setMaThanhVien(int maThanhVien) {
		MaThanhVien = maThanhVien;
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

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
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

	public Date getNgayHoanThanh() {
		return NgayHoanThanh;
	}

	public void setNgayHoanThanh(Date ngayHoanThanh) {
		NgayHoanThanh = ngayHoanThanh;
	}

	public String getTrangThai() {
		return TrangThai;
	}

	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}

	public String getDonViVanChuyen() {
		return DonViVanChuyen;
	}

	public void setDonViVanChuyen(String donViVanChuyen) {
		DonViVanChuyen = donViVanChuyen;
	}
	

	
}
