package com.yoon.board.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="member_secure")
public class MemberSecure {

	@Id
	@Column(name = "mem_userid", nullable = false)
	private int mem_userid;
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "mem_userid")
	private Member member;
	
	@Column(nullable = false, updatable = true, length = 100)
	private String mem_sec_password;
	
	@Column(nullable = false, updatable = true)
	private int mem_sec_luserid;
	
	@Column(nullable = false, updatable = true, length = 14)
	private String mem_sec_ldate;
}
