package com.fastcampus.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fastcampus.shop.dto.RentMoneyDTO;
import com.fastcampus.shop.service.RentService;

@Controller
public class RentMoneyController {

	@Autowired
	RentService rentService;
	
	@GetMapping("/rentMoney")
	public String rentMoneyList(Model model) {
		
		List<RentMoneyDTO> rentMoney = rentService.rentMoneyList();
		model.addAttribute("rentMoney", rentMoney);
		
		return "rentMoney";
	}
}
