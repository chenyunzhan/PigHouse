package com.zhan.model;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface MemberRepository  extends CrudRepository<Member, Long> {

	 public Member findByPhone(String phone); 
	 
	 
	 @Modifying 
	 @Query("update Member a set a.realName = ?1, a.cardId = ?2, a.cardImages = ?3, a.level = ?4 where a.id = ?5") 
	 @Transactional
	 public int updateUserCard(String realName, String cardId, String cardImages, String level, long id);
}
