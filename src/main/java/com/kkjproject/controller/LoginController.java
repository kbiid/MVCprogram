package com.kkjproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String showLogin( @RequestParam(value="error", required=false) String error, 
			@RequestParam(value="logout", required=false) String logout,
			Model model){
		
		if(error != null){
			model.addAttribute("errorMsg", "학번이나 비밀번호가 일치하지 않습니다.");
		}
		
		if(logout != null){
			model.addAttribute("logoutMsg", "로그아웃 성공.");
		}
		
		return "login";
	}
}