package com.fastcampus.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fastcampus.shop.dto.RentDTO;
import com.fastcampus.shop.dto.RentMoneyDTO;

@Mapper
public interface RentMapper {

	List<RentDTO> rentList();

	List<RentMoneyDTO> rentMoney();
	
}
