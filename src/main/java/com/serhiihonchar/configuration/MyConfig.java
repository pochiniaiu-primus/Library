package com.serhiihonchar.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.serhiihonchar.dao.BookDAO;
import com.serhiihonchar.dao.impl.JdbcTemplateBookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class MyConfig {

    @Bean
    public DataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("org.postgresql.jdbc3.Jdbc3ConnectionPool");
            dataSource.setJdbcUrl("jdbc:postgresql://localhost/library?ssl=false&amp&serverTimezone=UTC");
            dataSource.setUser("postgres");
            dataSource.setPassword("postgres");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
//@Bean
//public DataSource dataSource() {
//    EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//    EmbeddedDatabase db = builder
//            .setType(EmbeddedDatabaseType.HSQL)
//            .addScript("classpath:table.sql")
//            .addScript("classpath:data.sql")
//            .build();
//    return db;
//}


    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }

    @Bean(name = "template")
    public BookDAO jdbcTemplateDao(JdbcTemplate jdbcTemplate) {
        return new JdbcTemplateBookDao(jdbcTemplate);
    }
}