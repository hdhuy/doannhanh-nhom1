package Controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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

import Entity.HoaDon;

@Controller
public class Donhang {
	@Autowired
	SessionFactory factory;
	
	@RequestMapping(value="admin",params="donhang",method= RequestMethod.POST)
	public String adminDonhang(ModelMap m) {
		ArrayList<HoaDon> list= select("");

		m.addAttribute("list", list);
		m.addAttribute("include", "donhang");
		return "admin";
	}
	
	@RequestMapping(value="admin",params="locdonhang",method= RequestMethod.POST)
	public String loc(ModelMap model,HttpServletRequest request){
		model.addAttribute("include", "donhang");
		try {
			String sta=(String) request.getParameter("ngaybatdau");
			String end=(String) request.getParameter("ngayketthuc");
			String trangthai=(String) request.getParameter("trangthai");
			
			String hql ="";
			if(sta.equals("")||end.equals("")) {
				if(trangthai.equals("tat ca")) {
					hql="";
				}else {
					hql="where trangthai='"+trangthai+"'";
				}
			}else {
				if(trangthai.equals("tat ca")) {
					hql="where ngaymua BETWEEN '"+sta+"' and '"+end+"'";
				}else {
					hql="where ngaymua BETWEEN '"+sta+"' and '"+end+"' and trangthai='"+trangthai+"'";
				}
			}
			ArrayList<HoaDon> list= select(hql);
			System.out.println("IN: "+hql);
			model.addAttribute("list", list);
			model.addAttribute("message", "Hiện tại đang lọc theo: Từ: "+sta+" đến: "+end+" || trạng thái: "+trangthai);
		} catch (Exception e) {
			System.out.println("loi loc don hang: "+e);
		}
		
		
		return "admin";
	}
	@RequestMapping(value="admin",params="xnchuyen", method= RequestMethod.POST)
	public String chuyenthanh(ModelMap model,HttpServletRequest request) {
		model.addAttribute("include", "donhang");
		String[] cb= request.getParameterValues("checkbox[]");
		try {
			ArrayList<HoaDon> ds=new ArrayList<HoaDon>();
			for(String m:cb) {
				ds.add(selectId(m));
			}
			capnhat(ds);
			model.addAttribute("noti", "đã chuyển");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "admin";
	}
	//thao tac csdl
	@Transactional
	public void capnhat(ArrayList<HoaDon> h) {
		try {
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			session.update(h);
			t.commit();
			
		} catch (Exception e) {
			System.out.println("Lỗi cập nhật: "+e);
		}
	}
	
	@Transactional
	public HoaDon selectId(String id) {
		HoaDon h= new HoaDon();
		try {
			Session session = factory.openSession();
			h=(HoaDon) session.get(HoaDon.class,id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return h;
	}
	
	@Transactional
	public ArrayList<HoaDon> select(String more){
		ArrayList<HoaDon> list = new ArrayList<HoaDon>();
		try {
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			String hql= "FROM HoaDon "+more;
			Query query= session.createQuery(hql);
//			query.setFirstResult(index);
//			query.setMaxResults(20);
			list=(ArrayList<HoaDon>) query.list();
		} catch (Exception e) {
			System.out.println("Lỗi lấy hóa đơn từ csdl: "+e);
		}
		return list;
	}
}
