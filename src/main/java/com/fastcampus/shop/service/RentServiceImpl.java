package com.fastcampus.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastcampus.shop.dto.RentDTO;
import com.fastcampus.shop.dto.RentMoneyDTO;
import com.fastcampus.shop.mapper.RentMapper;

@Service
public class RentServiceImpl implements RentService {
	
	@Autowired
	RentMapper rentMapper;
	
	@Override
	public List<RentDTO> rentList() {
		List<RentDTO> rentList = rentMapper.rentList();
		
		return rentList;
	}
	
	@Override
	public List<RentMoneyDTO> rentMoneyList() {
		
		List<RentMoneyDTO> rentMoney = rentMapper.rentMoney();
		return rentMoney;
	}
}
