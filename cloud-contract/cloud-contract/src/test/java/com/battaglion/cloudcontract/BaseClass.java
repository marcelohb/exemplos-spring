package com.battaglion.cloudcontract;

import com.battaglion.cloudcontract.controller.TextSizeController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
class BaseClass {

    @Autowired
    private TextSizeController controller;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(controller);
    }
}