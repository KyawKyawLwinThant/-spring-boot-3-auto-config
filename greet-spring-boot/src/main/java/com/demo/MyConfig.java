package com.demo;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@AutoConfiguration
@ConditionalOnProperty(name = "my.app",havingValue = "amaze")
public class MyConfig {
    @Bean
    public GreetingBean greetingBean(){
        return new GreetingBean();
    }
}
