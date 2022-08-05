package com.ea.cs544.springjmsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringJmsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJmsDemoApplication.class, args);
    }

}
