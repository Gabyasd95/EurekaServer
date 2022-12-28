package com.example.eurekaservergaby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerGabyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerGabyApplication.class, args);
    }

}
