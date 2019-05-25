package com.spring.learn.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CustomerOrderControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void homeIsOkTest() throws Exception {
		mockMvc.perform(get("/order/home")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void homeContentTest() throws Exception{
		mockMvc.perform(get("/order/home")
						.contentType(MediaType.ALL_VALUE))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Welcome to order detail service."));
	}
}
