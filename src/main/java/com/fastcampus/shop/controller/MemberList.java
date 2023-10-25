package com.fastcampus.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fastcampus.shop.dto.Member;
import com.fastcampus.shop.service.MemberService;

@Controller
public class MemberList {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/list")
	public String memberList(Model model) {
		List<Member> members = memberService.getMemberList();
		
		model.addAttribute("members", members);
		return "memberList";
	}
	
	@GetMapping("/modify")
	public String getMember(@RequestParam(value = "cust_no") int cust_no, Model model) {
		
		Member member = memberService.getMember(cust_no);
		
		model.addAttribute("member", member);
		return "memberModify";
	}
	
	@PostMapping("/modifyOk")
	public String memberModify(Member member) {
		
		memberService.memberModify(member);
		
		return "redirect:/list";
	}

}
