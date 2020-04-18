package com.xcc.demo.redimi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 持久层配置文件
 */
@MapperScan(basePackages = {"com.xcc.demo.redimi.mapper"})
@Configuration
public class MybatisConfig {
}
