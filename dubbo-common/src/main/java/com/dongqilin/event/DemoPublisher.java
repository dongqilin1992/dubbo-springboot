package com.dongqilin.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/29 14:36
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationcontext;
    public void publish(String msg){
        applicationcontext.publishEvent(new DemoEvent(applicationcontext,msg));
    }
}
