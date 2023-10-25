package com.fastcampus.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastcampus.shop.dto.Member;
import com.fastcampus.shop.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;

	@Override
	public int getCust_no() {

		return memberMapper.getCust_no();
	}

	@Override
	public int memberRegister(Member member) {
		String grade = member.getGrade();
		
		if (grade.equals("P") || grade.equals("p")) {
			grade = "Platinum";
		} else if (grade.equals("G") || grade.equals("g")) {
			grade = "Gold";
		} else if (grade.equals("S") || grade.equals("s")) {
			grade = "Silver";
		}
		
		member.setGrade(grade);
		memberMapper.memberRegister(member);

		return 0;
	}
	
	@Override
	public List<Member> getMemberList() {
		
		return memberMapper.getMemberList();
	}
	
	@Override
	public Member getMember(int cust_no) {
		Member member = memberMapper.getMember(cust_no);
		String grade = member.getGrade();
		
		if(grade.equals("Platinum")) {
			grade = "P";
		} else if (grade.equals("Gold")) {
			grade = "G";
		} else if (grade.equals("Silver")) {
			grade = "S";
		}
		
		member.setGrade(grade);
		return member;
	}
	
	@Override
	public int memberModify(Member member) {
		String grade = member.getGrade();
		
		if (grade.equals("P") || grade.equals("p")) {
			grade = "Platinum";
		} else if (grade.equals("G") || grade.equals("g")) {
			grade = "Gold";
		} else if (grade.equals("S") || grade.equals("s")) {
			grade = "Silver";
		}
		
		member.setGrade(grade);
		memberMapper.memberUpdate(member);
		
		return 0;
	}
}
