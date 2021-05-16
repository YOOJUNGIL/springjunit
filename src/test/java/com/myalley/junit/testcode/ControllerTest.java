package com.myalley.junit.testcode;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@AutoConfigureMockMvc
@SpringBootTest
public class ControllerTest {

	@Autowired
	protected MockMvc mockMvc;
	
	@Test
	public void users() throws Exception {
		MvcResult result = mockMvc.perform(get("/users"))
			.andDo(print())
			.andExpect(status().is(HttpStatus.OK.value()))
			.andReturn();
		
		String contents = result.getResponse().getContentAsString();
		if(log.isDebugEnabled()) {
			log.debug("contents : " + contents);
		}
	}
	
	
	@Test
	public void delete() throws Exception {
		MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
		params.add("userId", "USER2");
		
		MvcResult result = mockMvc.perform(get("/delete"))
				.andDo(print())
				.andExpect(status().is(HttpStatus.OK.value()))
				.andReturn();
		
		String contents = result.getResponse().getContentAsString();
		if(log.isDebugEnabled()) {
			log.debug("contents : " + contents);
		}
	}
	
}
