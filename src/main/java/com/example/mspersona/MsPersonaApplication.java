package com.example.mspersona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsPersonaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsPersonaApplication.class, args);
    }

}
