package Entity;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "ChiTietHoaDon")
public class ChiTietHoaDon {
	int MaDonHang;
	int MaMonAn;
	String TenMonAn;
	int SoLuong;
	int Gia;
	int LoiNhuan;
	@Id
	@GeneratedValue
	int MaChiTietHoaDon;
	
	public ChiTietHoaDon() {
		
	}
	
	

	public int getMaChiTietHoaDon() {
		return MaChiTietHoaDon;
	}



	public void setMaChiTietHoaDon(int maChiTietHoaDon) {
		MaChiTietHoaDon = maChiTietHoaDon;
	}



	public ChiTietHoaDon(int maDonHang, int maMonAn, String tenMonAn, int soLuong, int gia, int loiNhuan,
			int maChiTietHoaDon) {
		super();
		MaDonHang = maDonHang;
		MaMonAn = maMonAn;
		TenMonAn = tenMonAn;
		SoLuong = soLuong;
		Gia = gia;
		LoiNhuan = loiNhuan;
		MaChiTietHoaDon = maChiTietHoaDon;
	}



	public int getMaDonHang() {
		return MaDonHang;
	}
	public void setMaDonHang(int maDonHang) {
		MaDonHang = maDonHang;
	}
	public int getMaMonAn() {
		return MaMonAn;
	}
	public void setMaMonAn(int maMonAn) {
		MaMonAn = maMonAn;
	}
	public String getTenMonAn() {
		return TenMonAn;
	}
	public void setTenMonAn(String tenMonAn) {
		TenMonAn = tenMonAn;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	public int getLoiNhuan() {
		return LoiNhuan;
	}
	public void setLoiNhuan(int loiNhuan) {
		LoiNhuan = loiNhuan;
	}
	
	
	
}
