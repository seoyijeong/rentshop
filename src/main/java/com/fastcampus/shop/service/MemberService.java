package com.fastcampus.shop.service;

import java.util.List;

import com.fastcampus.shop.dto.Member;

public interface MemberService {

	int getCust_no();

	int memberRegister(Member member);

	List<Member> getMemberList();

	Member getMember(int cust_no);

	int memberModify(Member member);

}
