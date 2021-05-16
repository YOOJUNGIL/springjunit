package com.myalley.junit.testcode;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myalley.junit.dao.dto.CustUser;
import com.myalley.junit.dao.service.CustUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class ServiceTest {

	@Autowired
	private CustUserService custUserService;
	
	@Test
	public void users() {
		List<CustUser> custUserList = custUserService.getCustUserList();
		if(log.isDebugEnabled()) {
			log.debug("custUserList : " + custUserList);
		}
	}
	
	@Test
	public void save() {
		int insCount = custUserService.save(new CustUser("XCON999", "99999999999", "SHIHEUNG"));
		if(log.isDebugEnabled()) {
			log.debug("insCount : " + insCount);
		}
	}
	
	@Test
	public void delete() {
		int delCount = custUserService.delete("XCON999");
		if(log.isDebugEnabled()) {
			log.debug("delCount : " + delCount);
		}
	}
	
}
