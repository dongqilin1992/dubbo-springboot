package com.dongqilin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/27 10:09
 */
@SpringBootApplication
//@EnableDubboAutoConfiguration
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
