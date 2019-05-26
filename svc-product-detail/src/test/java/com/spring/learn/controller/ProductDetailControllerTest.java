package com.spring.learn.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//This annotation will use spring testing framework instead of default Junit
@RunWith(SpringRunner.class)
//This annotation will provide spring application context
@SpringBootTest
//This annotation is used for web application to start a server
@AutoConfigureMockMvc
public class ProductDetailControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void homeIsOk() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/product/home")
							.contentType(MediaType.ALL_VALUE))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	public void home() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/product/home")
							.contentType(MediaType.ALL_VALUE))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Welcome to product detail service"));
	}
}
