package com.hzh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.hzh.controller"})
@EnableWebMvc
public class SpringMvcConfig {
}
