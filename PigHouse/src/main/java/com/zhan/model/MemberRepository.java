package com.zhan.model;

import org.springframework.data.repository.CrudRepository;


public interface MemberRepository  extends CrudRepository<Member, Long> {

	 public Member findByPhone(String phone); 
	 
}
