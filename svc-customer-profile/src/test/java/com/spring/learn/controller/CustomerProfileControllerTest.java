package com.spring.learn.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CustomerProfileControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void homeNotFoundTest() throws Exception {
		mockMvc.perform(get("/custome/home").contentType(MediaType.ALL_VALUE)).andExpect(status().isNotFound());

	}

	@Test
	public void homeFoundTest() throws Exception {
		mockMvc.perform(get("/customer/home").contentType(MediaType.ALL_VALUE)).andExpect(status().isOk());

	}

	@Test
	public void homeContentTest() throws Exception {
		mockMvc.perform(get("/customer/home")
				.contentType(MediaType.ALL_VALUE))
				.andExpect(status().isOk())
				.andExpect(content().string("Welcome to customer profile service."));

	}

}
