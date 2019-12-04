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
public class DangNhap {
	@RequestMapping(value="dangnhap",params="dangnhap", method= RequestMethod.POST)
	public String xulidangnhap(ModelMap model,HttpServletRequest request) {
		String re="acc";
		try {
			boolean isSuccess=false;
			String id=request.getParameter("id");
			String pa=request.getParameter("pa");
			ArrayList<ThanhVien> list = SelectThanhVien("");
			for(ThanhVien t:list) {
				if(t.getEmail().equals(id)||t.getSoDienThoai().equals(id)) {
					if(t.getMatKhau().equals(pa)) {
						re="success";
						isSuccess=true;
					}
				}
			}
			if(isSuccess==false) {
				model.addAttribute("LoginLog", "tên tài khoản hoặc mật khẩu sai");
			}
			
		} catch (Exception e) {
			System.out.println("loin xulidangnhap :"+e);
		}
		return re;
	};
	
	
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
