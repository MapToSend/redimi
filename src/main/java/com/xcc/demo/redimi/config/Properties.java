package com.xcc.demo.redimi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


//读取数据库
@Data
@Component
@ConfigurationProperties(prefix = "proper")
public class Properties {

    private String aaa;
    private String bbb;

}
