package Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ThongTinChinh")
public class ThongTinChinh {
	String TenCuaHang;
	String TenChu;
	String SoDangKi;
	Date NgayCap;
	String NoiCap;
	String DiaChi;
	String Email;
	String SoDienThoai;
	@Id
	@GeneratedValue
	int MaSoHuu;
	public ThongTinChinh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ThongTinChinh(String tenCuaHang, String tenChu, String soDangKi, Date ngayCap, String noiCap, String diaChi,
			String email, String soDienThoai, int maSoHuu) {
		super();
		TenCuaHang = tenCuaHang;
		TenChu = tenChu;
		SoDangKi = soDangKi;
		NgayCap = ngayCap;
		NoiCap = noiCap;
		DiaChi = diaChi;
		Email = email;
		SoDienThoai = soDienThoai;
		MaSoHuu = maSoHuu;
	}
	public String getTenCuaHang() {
		return TenCuaHang;
	}
	public void setTenCuaHang(String tenCuaHang) {
		TenCuaHang = tenCuaHang;
	}
	public String getTenChu() {
		return TenChu;
	}
	public void setTenChu(String tenChu) {
		TenChu = tenChu;
	}
	public String getSoDangKi() {
		return SoDangKi;
	}
	public void setSoDangKi(String soDangKi) {
		SoDangKi = soDangKi;
	}
	public Date getNgayCap() {
		return NgayCap;
	}
	public void setNgayCap(Date ngayCap) {
		NgayCap = ngayCap;
	}
	public String getNoiCap() {
		return NoiCap;
	}
	public void setNoiCap(String noiCap) {
		NoiCap = noiCap;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSoDienThoai() {
		return SoDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}
	public int getMaSoHuu() {
		return MaSoHuu;
	}
	public void setMaSoHuu(int maSoHuu) {
		MaSoHuu = maSoHuu;
	}
	
	
}
