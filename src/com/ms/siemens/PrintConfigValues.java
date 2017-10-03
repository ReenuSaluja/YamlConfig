package com.ms.siemens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class PrintConfigValues implements CommandLineRunner {

    @Value("${config.param}")
    private String textValue;

    @Autowired
    Configuration configuration;

    public void run(String... args) throws Exception {

        System.out.println("Via @Value annotation:");
        System.out.println(textValue);


        System.out.println("Via configuration class with hardcoded values:");
        System.out.println(String.join(",", configuration.getListParams()));

        System.out.println("Via configuration class with environment variable:");
        System.out.println(configuration.getPath());

    }
}