package com.myalley.junit.testcode;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myalley.junit.dao.dto.CustUser;
import com.myalley.junit.dao.service.custuser.CustUserMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class DaoTest {

	@Autowired
	private CustUserMapper custUserMapper;
	
	@Test
	public void users() {
		List<CustUser> custUserList = custUserMapper.getCustUserList();
		if(log.isDebugEnabled()) {
			log.debug("custUserList : " + custUserList);
		}
	}
	
	@Test
	public void save() {
		custUserMapper.save(new CustUser("XCON999", "00000000000", "SHIHEUNG"));
	}
	
	@Test
	public void delete() {
		custUserMapper.delete("XCON999");
	}
	
}
