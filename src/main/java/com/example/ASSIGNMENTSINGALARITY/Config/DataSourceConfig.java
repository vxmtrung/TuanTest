//package com.example.ASSIGNMENTSINGALARITY.Config;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourceConfig {
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
//        dataSourceBuilder.url("jdbc:mysql://localhost:3306/SingalarityAss");
//        dataSourceBuilder.username("root");
//        dataSourceBuilder.password("123456");
//        return dataSourceBuilder.build();
//    }
//
//}
