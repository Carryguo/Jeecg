package com.carry.jeecgdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.carry.jeecgdemo.mapper")
public class JeecgdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeecgdemoApplication.class, args);
    }

}
