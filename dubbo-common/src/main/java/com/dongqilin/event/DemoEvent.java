package com.dongqilin.event;

import org.springframework.context.ApplicationEvent;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/29 14:32
 */
public class DemoEvent extends ApplicationEvent{
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }
}
