package com.codewithkd.SpringMVC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codewithkd.SpringMVC.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepo repo;
	
	@GetMapping("aliens")
	@ResponseBody
	public List<Alien> getAliens() {
		List<Alien> alien=repo.findAll();
		return alien;
	}
}
