package Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DanhGia")
public class DanhGia {
	int MaMonAn;
	int MaThanhVien;
	Date NgayDanhGia;
	String NoiDung;
	@Id
	@GeneratedValue
	int MaDanhGia;
	public DanhGia(int maMonAn, int maThanhVien, Date ngayDanhGia, String noiDung, int maDanhGia) {
		super();
		MaMonAn = maMonAn;
		MaThanhVien = maThanhVien;
		NgayDanhGia = ngayDanhGia;
		NoiDung = noiDung;
		MaDanhGia = maDanhGia;
	}
	public DanhGia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaMonAn() {
		return MaMonAn;
	}
	public void setMaMonAn(int maMonAn) {
		MaMonAn = maMonAn;
	}
	public int getMaThanhVien() {
		return MaThanhVien;
	}
	public void setMaThanhVien(int maThanhVien) {
		MaThanhVien = maThanhVien;
	}
	public Date getNgayDanhGia() {
		return NgayDanhGia;
	}
	public void setNgayDanhGia(Date ngayDanhGia) {
		NgayDanhGia = ngayDanhGia;
	}
	public String getNoiDung() {
		return NoiDung;
	}
	public void setNoiDung(String noiDung) {
		NoiDung = noiDung;
	}
	public int getMaDanhGia() {
		return MaDanhGia;
	}
	public void setMaDanhGia(int maDanhGia) {
		MaDanhGia = maDanhGia;
	}
	
	
}
