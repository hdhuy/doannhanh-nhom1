package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class AdminRedirect {

	@RequestMapping("admin")
	public String admin(ModelMap m) {
		m.addAttribute("include", "thongbao");
		return "admin";
	}
	
	@RequestMapping(value="admin",params="thongbao",method= RequestMethod.POST)
	public String adminThongbao(ModelMap m) {
		m.addAttribute("include", "donhang");
		return "admin";
	}
	//doanh thu
	@RequestMapping(value="admin",params="doanhthu",method= RequestMethod.POST)
	public String adminDpanhthun(ModelMap m) {
		m.addAttribute("include", "doanhthu");
		return "admin";
	}
	//kho
	@RequestMapping(value="admin",params="qlkhohang",method= RequestMethod.POST)
	public String adminkho(ModelMap m) {
		m.addAttribute("include", "qlkhohang");
		return "admin";
	}
	@RequestMapping(value="admin",params="nhap",method= RequestMethod.POST)
	public String nhap(ModelMap m) {
		m.addAttribute("include", "nhap");
		return "admin";
	}
	@RequestMapping(value="admin",params="xuat",method= RequestMethod.POST)
	public String xuat(ModelMap m) {
		m.addAttribute("include", "xuat");
		return "admin";
	}
	@RequestMapping(value="admin",params="lichsukho",method= RequestMethod.POST)
	public String lichsukho(ModelMap m) {
		m.addAttribute("include", "lichsukho");
		return "admin";
	}
	@RequestMapping(value="admin",params="nguyenlieu",method= RequestMethod.POST)
	public String nguyenlieu(ModelMap m) {
		m.addAttribute("include", "nguyenlieu");
		return "admin";
	}
	//mon an
	@RequestMapping(value="admin",params="qlmonan",method= RequestMethod.POST)
	public String monan(ModelMap m) {
		m.addAttribute("include", "qlmonan");
		return "admin";
	}
	@RequestMapping(value="admin",params="themmonan",method= RequestMethod.POST)
	public String themmonan(ModelMap m) {
		m.addAttribute("include", "themmonan");
		return "admin";
	}
	//thanh vien
	@RequestMapping(value="admin",params="qlthanhvien",method= RequestMethod.POST)
	public String qlthanhvien(ModelMap m) {
		m.addAttribute("include", "qlthanhvien");
		return "admin";
	}
	@RequestMapping(value="admin",params="themthanhvien",method= RequestMethod.POST)
	public String adminThemthanhvien(ModelMap m) {
		m.addAttribute("include", "themthanhvien");
		return "admin";
	}
	
}
