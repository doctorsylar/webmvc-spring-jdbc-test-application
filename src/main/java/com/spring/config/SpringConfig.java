package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan (value = {"com.spring.services", "com.spring.dao"})
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate () {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource () {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spring-application");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("12345");
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return driverManagerDataSource;
    }

    //meh

}
