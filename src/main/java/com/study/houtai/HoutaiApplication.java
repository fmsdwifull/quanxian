package com.study.houtai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.study.houtai.mapper")
@SpringBootApplication
public class HoutaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoutaiApplication.class, args);
    }

}
