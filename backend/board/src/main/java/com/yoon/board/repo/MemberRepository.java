package com.yoon.board.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yoon.board.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{
	
	Optional<Member> findByLoginId(String loginId); // 로그인 아이디로 회원조회
	
	Optional<Member> findByEmail(String email); // 이메일로 회원조회
	
	@Query("select m from Member m inner join MemberSecure ms on m.mem_userid = ms.mem_userid"
			+ "where m.mem_login_id = :loginId and ms.password = :password")
	Member findMember(String loginId, String password); // 로그인
	
}
