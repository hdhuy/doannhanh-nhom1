package Controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Entity.ThanhVien;

@Controller
public class QLThanhVien {
	
	
	@RequestMapping(value="admin", params="tktv", method= RequestMethod.POST)
	public String ketquatk(HttpServletRequest request,ModelMap model){
		model.addAttribute("include", "qlthanhvien");
		ArrayList<ThanhVien> list=layDanhSach(request, model);
		model.addAttribute("list", list);
		model.addAttribute("st", request.getParameter("txtTk"));
		
		return "admin";
	}
	@RequestMapping(value="admin", params="chontv", method= RequestMethod.POST)
	public String chon(HttpServletRequest request,ModelMap model){
		model.addAttribute("include", "qlthanhvien");
		ArrayList<ThanhVien> list=layDanhSach(request, model);
		String m=request.getParameter("tv");
		ThanhVien tv= new ThanhVien();
		for(ThanhVien c:list) {
			if(c.getEmail().equals(m)) {
				tv=c;
			}
		}
		model.addAttribute("tv", tv);
		model.addAttribute("st", request.getParameter("txtTk"));
		
		return "admin";
	}
	public ArrayList<ThanhVien> layDanhSach(HttpServletRequest request,ModelMap model){
		ArrayList<ThanhVien> list=new ArrayList<ThanhVien>();
		try {
			String m=request.getParameter("txtTk");
			list=SelectThanhVien("where HoTen like '%"+m+"%'");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	@Autowired
	SessionFactory factory;
	@Transactional
	public ArrayList<ThanhVien> SelectThanhVien(String addmore) {
		ArrayList<ThanhVien> list = new ArrayList<ThanhVien>();
		try {
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			String hql= "FROM ThanhVien "+addmore;
			Query query= session.createQuery(hql);
			list=(ArrayList<ThanhVien>) query.list();
		} catch (Exception e) {
			System.out.println("loi select thanh vien : "+e);
		}
		return list;
	}
}
