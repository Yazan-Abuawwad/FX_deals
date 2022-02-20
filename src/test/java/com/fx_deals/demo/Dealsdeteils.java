package com.fx_deals.demo;



import com.fx_deals.demo.controller.DealsDeteilsResource;
import com.fx_deals.demo.service.DealsDeteilsService;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDateTime;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class Dealsdeteils {



    private MockMvc mockMvc;




    @Test
    public void testPost() throws Exception {



        String json = "{\n" +
                "  \"amount\": \"25\",\n" +
                "  \"dealTime\": \" " + LocalDateTime.now() +"  \"\n" +
                "  \"fromCIC\": \"90\"\n" +
                "  \"toCIC\": \"100\"\n" +
                "}";
        mockMvc.perform(post("/api/deal")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.amount", Matchers.is("25")))
                .andExpect(jsonPath("$.dealTime", Matchers.is(LocalDateTime.now())))
                .andExpect(jsonPath("$.fromCIC", Matchers.is("90")))
                .andExpect(jsonPath("$.toCIC", Matchers.is("100")))
                .andExpect(jsonPath("$.*", Matchers.hasSize(2)));
    }



    @Mock
    private DealsDeteilsService deteilsService;

    @InjectMocks
    private DealsDeteilsResource dealsResource;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(dealsResource)
                .build();
    }





}
