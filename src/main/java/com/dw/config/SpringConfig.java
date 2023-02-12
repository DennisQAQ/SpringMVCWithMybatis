package com.dw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//1.启用spring注解是编程的的核心配置类
@Configuration//设置为spring配置类
@ComponentScan({"com.dw.service"})//@ComponentScan主要就是定义扫描的路径从中找出标识了需要装配的类自动装配到spring的bean容器中
@PropertySource("classpath:jdbc.properties")//加载数据库链接的配置文件
@Import({JdbcConfig.class, MybatisConfig.class})//导入所加载的类
@EnableTransactionManagement
public class SpringConfig {
}
