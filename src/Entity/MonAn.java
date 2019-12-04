package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MonAn")
public class MonAn {
	@Id
	@GeneratedValue
	int MaMonAn;
	String TenMonAn;
	int Gia;
	int LoiNhuan;
	String MoTa;
	String LoaiSanPham;
	String LinkAnh;
		
	public MonAn() {
	}
	
	public MonAn(int maMonAn, String tenMonAn, int gia, int loiNhuan, String moTa, String loaiSanPham, String linkAnh) {
		MaMonAn = maMonAn;
		TenMonAn = tenMonAn;
		Gia = gia;
		LoiNhuan = loiNhuan;
		MoTa = moTa;
		LoaiSanPham = loaiSanPham;
		LinkAnh = linkAnh;
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
	public String getMoTa() {
		return MoTa;
	}
	public void setMoTa(String moTa) {
		MoTa = moTa;
	}
	public String getLoaiSanPham() {
		return LoaiSanPham;
	}
	public void setLoaiSanPham(String loaiSanPham) {
		LoaiSanPham = loaiSanPham;
	}
	public String getLinkAnh() {
		return LinkAnh;
	}
	public void setLinkAnh(String linkAnh) {
		LinkAnh = linkAnh;
	}
	
	
	
}
