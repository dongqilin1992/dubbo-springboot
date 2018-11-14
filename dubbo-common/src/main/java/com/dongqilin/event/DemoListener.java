package com.dongqilin.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/29 14:34
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("msg:"+msg);
    }
}
