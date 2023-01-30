package com.example.ghactions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GhActionsApplicationTests {

    @Test
    void test() {
        assertThat(true).isEqualTo(true);
    }

}
