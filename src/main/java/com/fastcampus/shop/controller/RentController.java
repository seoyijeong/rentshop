package com.fastcampus.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fastcampus.shop.dto.RentDTO;
import com.fastcampus.shop.service.RentService;

@Controller
public class RentController {

	@Autowired
	RentService rentService;
	
	@GetMapping("/rentList")
	public String rentList(Model model) {
		
		List<RentDTO> rentList = rentService.rentList();
		model.addAttribute("rentList", rentList);
		
		return "rentList";
	}
}
