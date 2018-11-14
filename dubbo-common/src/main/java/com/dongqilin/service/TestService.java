package com.dongqilin.service;

import com.dongqilin.annotation.LogAnnotation;
import com.dongqilin.config.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/29 14:24
 */
@Component
public class TestService {
    @LogAnnotation()
    public void doservice(){
        System.out.println("doservice");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        TestService testService = context.getBean(TestService.class);
        testService.doservice();
    }

}
