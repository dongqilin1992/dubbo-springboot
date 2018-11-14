package com.dongqilin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/29 14:25
 */
@Configuration
@ComponentScan("com.dongqilin")
@EnableAspectJAutoProxy
public class AopConfig {
}
