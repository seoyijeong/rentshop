package com.fastcampus.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fastcampus.shop.dto.Member;
import com.fastcampus.shop.service.MemberService;

@Controller
public class RegisterController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/register")
	public String register(Model model) {
		int cust_no = memberService.getCust_no();
		model.addAttribute("cust_no", cust_no);
		return "memberRegister";
	}
	
	@PostMapping("/registerOk")
	public String registerOk(Member member) {
		memberService.memberRegister(member);
		
		return "redirect:/list";
	}
		
}
