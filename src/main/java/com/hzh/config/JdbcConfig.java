package com.hzh.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {

    @Value("${jdbc.driver}")
    private String  Driver;
    @Value("${jdbc.url}")
    private String  Url;
    @Value("${jdbc.username}")
    private String  Username;
    @Value("${jdbc.password}")
    private String  Password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(Driver);
        dataSource.setUrl(Url);
        dataSource.setUsername(Username);
        dataSource.setPassword(Password);
        return dataSource;
    }

}
