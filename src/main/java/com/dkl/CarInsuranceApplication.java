package com.dkl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.dkl.dao")
@SpringBootApplication
public class CarInsuranceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarInsuranceApplication.class, args);
    }
}
