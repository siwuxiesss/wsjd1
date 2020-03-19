package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.dao")
public class Wsjd1Application {

    public static void main(String[] args) {
        SpringApplication.run(Wsjd1Application.class, args);
    }

}
