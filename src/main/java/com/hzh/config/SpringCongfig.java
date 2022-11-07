package com.hzh.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.hzh.service"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringCongfig {
}
