package com.example.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@Slf4j
public class ProductControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    //    브라우저에서 URL을 요청한 것과 같은 환경을 구성해준다.
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void showList() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/product/list")).andReturn().getModelAndView().getModelMap().toString());
    }

}
