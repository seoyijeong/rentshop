package com.fastcampus.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fastcampus.shop.dto.Member;

@Mapper
public interface MemberMapper {

	int getCust_no();
	
	int memberRegister(Member member);

	List<Member> getMemberList();

	Member getMember(int cust_no);

	int memberUpdate(Member member);

}
