package com.fastcampus.shop.service;

import java.util.List;

import com.fastcampus.shop.dto.RentDTO;
import com.fastcampus.shop.dto.RentMoneyDTO;

public interface RentService {

	List<RentDTO> rentList();

	List<RentMoneyDTO> rentMoneyList();

}
