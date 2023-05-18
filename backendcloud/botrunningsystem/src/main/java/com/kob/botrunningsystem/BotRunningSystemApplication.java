package com.kob.botrunningsystem;

import com.kob.botrunningsystem.service.impl.BotRunnningServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BotRunningSystemApplication {

    public static void main(String[] args) {
        BotRunnningServiceImpl.botpool.start();
        SpringApplication.run(BotRunningSystemApplication.class, args);
    }
}
