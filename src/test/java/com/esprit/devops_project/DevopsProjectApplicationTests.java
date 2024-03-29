package com.esprit.devops_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsProjectApplicationTests {

    @Test
    void verifyString() {
       int x=100;
        Assertions.assertEquals(100,x);

    }

}
