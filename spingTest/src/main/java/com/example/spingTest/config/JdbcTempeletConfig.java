package com.example.spingTest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


@Configuration
public class JdbcTempeletConfig {
    @Bean
    public JdbcTemplate jdbcTempelet(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
