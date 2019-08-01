package com.feelingtech.base;

import com.feelingtech.util.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * 项目入口,但不是真正的入口
 */
@SpringBootApplication
@EntityScan("com.feelingtech.base")
@EnableEurekaClient
public class BaseAppilcation {
    public static void main(String[] args) {
        SpringApplication.run(BaseAppilcation.class,args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
