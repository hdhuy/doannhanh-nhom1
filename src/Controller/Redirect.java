package Controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Redirect {

	@RequestMapping("acc")
	public String acc() {
		return "acc";
	}
	@RequestMapping("admin")
	public String admin() {
		return "admin";
	}
	@RequestMapping("admin/themthanhvien")
	public String attv() {
		
		return "admin";
	}
	@RequestMapping("home")
	public String home() {
		return "";
	}
}
