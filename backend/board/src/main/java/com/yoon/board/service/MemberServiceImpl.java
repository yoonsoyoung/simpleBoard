package com.yoon.board.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoon.board.entity.Member;
import com.yoon.board.repo.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
	
	private final MemberRepository memberRepo = null;
	
	@Override
	public Optional<Member> login(Member member) { // 로그인
		return Optional.empty();
	}

	@Override
	public int registerMember(Member member, String password) { // 회원가입
		return 0;
	}

	@Override
	public Optional<Member> getMember(String loginId) { // 로그인 아이디로 회원 조회
		return Optional.empty();
	}

	@Override
	public int updateMember(int userid, String loginId, String password, String name) { // 회원 정보 수정
		return 0;
	}

	@Override
	public int deleteMember(int userid) { // 회원 탈퇴
		return 0;
	}

	
	
}
