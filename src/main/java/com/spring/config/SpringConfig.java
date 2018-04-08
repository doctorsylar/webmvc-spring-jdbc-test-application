package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (value = {"com.spring.services", "com.spring.dao"})
public class SpringConfig {


}
