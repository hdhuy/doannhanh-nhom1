package Controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
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

public class ThemThanhVien {

	

	HttpServletRequest r;
	
	@RequestMapping(value="admin", params="ttv", method= RequestMethod.POST)
	public String reDangki(ModelMap model,HttpServletRequest request) {
		model.addAttribute("include", "themthanhvien");
		try {
			
			if(validateField(request, model)==true) {
				System.out.println("validate field=true");
				ThanhVien tv= TaoThanhVien(request);
				if(validateThanhVien(tv, model)==true) {
					
					ThemThanhVien(tv);
					model.addAttribute("message", "Thêm thành công "+tv.getHoTen()+" !");
				}
				
			}else {
				model.addAttribute("message", "Vui lòng kiểm tra lại !");
			}
		} catch (Exception e) {
			System.out.println("lỗi đăng kí: "+e);
		}
		return "admin";
	}
	
	public ThanhVien TaoThanhVien(HttpServletRequest request) {
		
		ThanhVien tv= null;
		try {
			String hoten=request.getParameter("hoten");
			String email=request.getParameter("email");
			String soDienThoai=request.getParameter("sdt");
			String cmnd=request.getParameter("cmnd");
			String diachi=request.getParameter("diachi");
			String ns=request.getParameter("ns");
			String mk=request.getParameter("mk");
			String gioitinh=request.getParameter("gioitinh");
			String chucvu=request.getParameter("chucvu");
			int gt=0;
			if(gioitinh.equals("Nam")) {
				gt=1;
			}
			
			System.out.println(ns);
			String startDate="2013-02-02";
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-dd-mm");
			java.util.Date date = sdf1.parse(startDate);
			java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());  
			Date date1 = sqlStartDate;
			
			tv= new ThanhVien(hoten, soDienThoai, email, diachi, cmnd, mk, date1, gt, "", chucvu, "");
		} catch (Exception e) {
			System.out.println("tạo thành viên sai: "+e);
		}
		
		return tv;
	}
	boolean validateField(HttpServletRequest request,ModelMap model) {
		boolean re=true;
		try {
			String hoten=request.getParameter("hoten");
			String email=request.getParameter("email");
			String soDienThoai=request.getParameter("sdt");
			String cmnd=request.getParameter("cmnd");
			String diachi=request.getParameter("diachi");
			String ns=request.getParameter("ns");
			String mk=request.getParameter("mk");
			String xnmk=request.getParameter("xnmk");
			String gioitinh=request.getParameter("gioitinh");
			
			//boolean emailMa=email.matches("^(.+)@(.+)$");
			if(hoten.equals("")) {
				model.addAttribute("hoten", "họ tên không đúng định dạng");
				re=false;
			}
			if(email.equals("")||!email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")) {
				model.addAttribute("email", "email không đúng định dạng");
				re=false;
			}
			if(soDienThoai.equals("")||soDienThoai.length()!=10) {
				model.addAttribute("sdt", "sdt  không đúng định dạng");
				re=false;
			}
			if(cmnd.equals("")||cmnd.length()<9||cmnd.length()>12) {
				model.addAttribute("cmnd", "CMND không đúng định dạng");
				re=false;
			}
			if(!mk.equals(xnmk)||mk.length()<5||mk.length()>20) {
				model.addAttribute("xnmk", "Xác nhận sai");
				re=false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return re;
		
	}
	boolean validateThanhVien(ThanhVien tv,ModelMap model) {
		boolean re=true;
		try {
			ArrayList<ThanhVien> list=SelectThanhVien("");
			for(ThanhVien t:list) {
				if(tv.getEmail().equals(t.getEmail())) {
					model.addAttribute("email", "email đã tồn tại");
					re=false;
				}
				if(tv.getSoDienThoai().equals(t.getSoDienThoai())) {
					model.addAttribute("sdt", "sô điện thoại đã tồn tại");
					re=false;
				}
				if(tv.getCMND().equals(t.getCMND())) {
					model.addAttribute("cmnd", "sô CMND thoại đã tồn tại");
					re=false;
				}
			}
		} catch (Exception e) {
			System.out.println("validate dangki sai: "+e);
		}
		return re;
		
	}
	

	@Autowired
	SessionFactory factory;
	
	@Transactional
	public void ThemThanhVien(ThanhVien tv) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(tv);
			t.commit();
		} catch (Exception e) {
			System.out.print("Theemthanhf viên - transacl lỗi: "+e);
		}
		
	}
	
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
