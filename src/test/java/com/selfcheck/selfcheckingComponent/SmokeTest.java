package com.selfcheck.selfcheckingComponent;

import com.selfcheck.selfcheckingComponent.controller.WebController;
import com.selfcheck.selfcheckingComponent.controller.HereTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {
    @Autowired
    private WebController webController;
    @Autowired
    private HereTest hereTest;

//    @Test
//    public void contextLoads() throws Exception {
//        assertThat(webController).isNotNull();
//    }

    @Test
    public void contextLoads1() throws Exception {
        assertThat(hereTest).isNotNull();
    }
}
