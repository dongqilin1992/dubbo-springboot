package com.dongqilin.service;

import com.dongqilin.config.EventConfig;
import com.dongqilin.event.DemoPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/29 14:39
 */
public class TestEvent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("nihao");
    }
}
