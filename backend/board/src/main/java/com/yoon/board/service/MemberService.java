package com.yoon.board.service;

import java.util.Optional;

import com.yoon.board.entity.Member;

public interface MemberService {
	Optional<Member> login(Member member); // 로그인

	int registerMember(Member member, String password); // 회원가입

	Optional<Member> getMember(String loginId); // 로그인 아이디로 조회

	int updateMember(int userid, String loginId, String password, String name); // 회원정보 수정

	int deleteMember(int userid); // 회원 탈퇴
}
