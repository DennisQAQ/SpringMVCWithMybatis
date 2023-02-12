package com.dw.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource DataSource (){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return  druidDataSource;
    }

    /**
     * 配置事务管理
     * @param DataSource
     * @return
     */
    @Bean
    public PlatformTransactionManager platformTransactionManager (DataSource DataSource){
        DataSourceTransactionManager DataSourceTransactionManager = new DataSourceTransactionManager();
        DataSourceTransactionManager.setDataSource(DataSource);

        return DataSourceTransactionManager;
    }
}
