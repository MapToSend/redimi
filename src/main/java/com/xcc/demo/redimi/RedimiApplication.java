package com.xcc.demo.redimi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class RedimiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedimiApplication.class, args);
    }

    /**
     *
     * 1: web
     * 2: myabtis
     * 3: html
     * 4: redis
     * 5: 定时任务
     * 6: Swagger
     * 7: 读取配置文件属性
     * 8: aop ioc
     *
     *
     */


}
