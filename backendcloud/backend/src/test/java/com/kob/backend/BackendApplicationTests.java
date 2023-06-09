package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BackendApplicationTests {

    @Test
    void contextLoads() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("pa"));
        System.out.println(passwordEncoder.matches("pa","$2a$10$IXSP6F066DoExtBhzrZaR.Xl2YsmC6F.DMutwyi5YymDafDhF2Rhm"));
        System.out.println(passwordEncoder.encode("pb"));

    }

}
