package com.example.eurekaservergabysusti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerGabySustiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerGabySustiApplication.class, args);
    }

}
