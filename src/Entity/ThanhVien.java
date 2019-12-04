package Entity;



import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name = "ThanhVien")
public class ThanhVien {
	@Id
	@GeneratedValue
	int MaThanhVien;
	String HoTen;
	String SoDienThoai;
	String Email;
	String DiaChi;
	String CMND;
	String MatKhau;
	Date NgaySinh;
	int GioiTinh;
	String MoTa;
	String ChucVu;
	String LinkAnh;
	
	public ThanhVien() {
	}

	public int getMaThanhVien() {
		return MaThanhVien;
	}
	

	public ThanhVien(int maThanhVien, String hoTen, String soDienThoai, String email, String diaChi, String cMND,
			String matKhau, Date ngaySinh, int gioiTinh, String moTa, String chucVu, String linkAnh) {
		super();
		MaThanhVien = maThanhVien;
		HoTen = hoTen;
		SoDienThoai = soDienThoai;
		Email = email;
		DiaChi = diaChi;
		CMND = cMND;
		MatKhau = matKhau;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		MoTa = moTa;
		ChucVu = chucVu;
		LinkAnh = linkAnh;
	}
	public ThanhVien(String hoTen, String soDienThoai, String email, String diaChi, String cMND,
			String matKhau, Date ngaySinh, int gioiTinh, String moTa, String chucVu, String linkAnh) {
		super();
		HoTen = hoTen;
		SoDienThoai = soDienThoai;
		Email = email;
		DiaChi = diaChi;
		CMND = cMND;
		MatKhau = matKhau;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		MoTa = moTa;
		ChucVu = chucVu;
		LinkAnh = linkAnh;
	}

	public void setMaThanhVien(int maThanhVien) {
		MaThanhVien = maThanhVien;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public String getMatKhau() {
		return MatKhau;
	}

	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}

	public Date getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public int getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		GioiTinh = gioiTinh;
	}

	public String getMoTa() {
		return MoTa;
	}

	public void setMoTa(String moTa) {
		MoTa = moTa;
	}

	public String getChucVu() {
		return ChucVu;
	}

	public void setChucVu(String chucVu) {
		ChucVu = chucVu;
	}

	public String getLinkAnh() {
		return LinkAnh;
	}

	public void setLinkAnh(String linkAnh) {
		LinkAnh = linkAnh;
	}

	
}
