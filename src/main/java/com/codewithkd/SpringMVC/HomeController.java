package com.codewithkd.SpringMVC;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.codewithkd.SpringMVC.model.Alien;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		m.addAttribute("result",repo.findAll());
		return "showAliens";
	}
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid,Model m) {
		m.addAttribute("result",repo.getOne(aid));
		return "showAliens";
	}
	
	@GetMapping("getAlienByName")
	public String getAlienByName(@RequestParam String aname,Model m) {
		m.addAttribute("result",repo.find(aname));
		return "showAliens";
	}
	
//	@GetMapping("getAlien")
//	public String getAlien(Model m) {
//		List<Alien> aliens = Arrays.asList(new Alien(2,"Kaushal"), new Alien(3,"Navin"));
//		m.addAttribute("result",aliens);
//		return "showAliens";
//	}
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a) {
		repo.save(a);
		return "result";
	}   
	
	
//	@RequestMapping(value="addAlien",method = RequestMethod.POST)
//	public String addAlien(@ModelAttribute("a1") Alien a) {
//		return "result";
//	}
	
//	@RequestMapping("addAlien")
//	public String addAlien(@RequestParam("aid")int aid, @RequestParam("aname")String aname, Model m) {
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
//		
//		m.addAttribute("alien",a);
//		return "result";
//	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i, @RequestParam("num2")int j, ModelMap m) {		
		
		int num3 = i + j;
		m.addAttribute("sum3",num3);		
		
		return "result";
	}
	
	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1")int i, @RequestParam("num2")int j) {
//		
//		ModelAndView mv=new ModelAndView("result");
////		ModelAndView mv=new ModelAndView();	
////		mv.setViewName("result");
//		
//		int num3 = i + j;
//		mv.addObject("sum3",num3);		
//		
//		return mv;
//	}
	
//	@RequestMapping("add")
//	public String add(@RequestParam("num1")int i,@RequestParam("num2")int j,HttpSession session) {
//		
//		int num3=i+j;
//		
//		session.setAttribute("sum3", num3);
//		
//		return "result.jsp";													
//	}
	
//	@RequestMapping("add")
//	public String add(HttpServletRequest req) {
//		
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		int num3=i+j;
//		
//		HttpSession session =req.getSession();
//		session.setAttribute("sum3", num3);
//		
//		return "result.jsp";
//	}
}
