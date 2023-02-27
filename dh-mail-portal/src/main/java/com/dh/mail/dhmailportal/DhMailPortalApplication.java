package com.dh.mail.dhmailportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.dh.mail.feignclient")
public class DhMailPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DhMailPortalApplication.class, args);
    }

}
