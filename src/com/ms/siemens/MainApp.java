package com.ms.siemens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Configuration.class)
public class MainApp {


    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }
}