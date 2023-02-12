package com.dw.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//myabtis 配置类
public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean SqlSessionFactory (DataSource DataSource){
        SqlSessionFactoryBean SqlSessionFactory = new SqlSessionFactoryBean();
        SqlSessionFactory.setDataSource(DataSource);
        SqlSessionFactory.setTypeAliasesPackage("com.dw.entities");
        return SqlSessionFactory;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer (){
        MapperScannerConfigurer mapperScannerConfigurer =new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.dw.dao");
        return mapperScannerConfigurer;
    }
}
