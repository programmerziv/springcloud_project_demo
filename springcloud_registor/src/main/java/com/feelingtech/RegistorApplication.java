package com.feelingtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistorApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistorApplication.class,args);
    }
}
