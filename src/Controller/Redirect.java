package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Redirect {

	@RequestMapping("acc")
	public String acc() {
		return "acc";
	}
	
	@RequestMapping("trangchu")
	public String home() {
		return "trangchu";
	}

}