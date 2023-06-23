package com.codewithkd.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
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
