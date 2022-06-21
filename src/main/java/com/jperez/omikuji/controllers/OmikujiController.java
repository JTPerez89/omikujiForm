package com.jperez.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class OmikujiController {
	
	@RequestMapping("/omikuji")
	public String index(HttpSession session) {
		return "index.jsp";
	}
	
	@RequestMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		model.addAttribute("number", session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person", session.getAttribute("person"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("thing", session.getAttribute("thing"));
		model.addAttribute("nice", session.getAttribute("nice"));
		
		System.out.println("test");
		
		return "show.jsp";
	}
	
	@PostMapping("/create")
	public String create(HttpSession session,
			@RequestParam(value="number") int number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="thing") String thing,
			@RequestParam(value="nice") String nice) {
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("nice", nice);
		
		return "redirect:/omikuji/show";
	}

}
