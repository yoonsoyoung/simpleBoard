package com.yoon.board.entity;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="member")
@DynamicUpdate
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mem_userid;
	
	@Column(nullable = false, unique = true, updatable = true, length = 45)
	private String mem_login_id;

	@Column(nullable = false, updatable = true, length = 10)
	private String mem_name;
	
	@Column(nullable = false, unique = true, updatable = true, length = 100)
	private String mem_email;

	@Column(nullable = false, updatable = true)
	private int mem_inuserid;
	
	@Column(nullable = false, updatable = true, length = 14)
	private String mem_indate;

	@Column(nullable = false, updatable = true)
	private int mem_luserid;
	
	@Column(nullable = false, updatable = true, length = 14)
	private String mem_ldate;
	
	
}
