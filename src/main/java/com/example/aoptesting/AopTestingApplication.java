package com.example.aoptesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopTestingApplication.class, args);
    }

}
