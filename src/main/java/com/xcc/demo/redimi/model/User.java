package com.xcc.demo.redimi.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:39  薪资
 */
@Data
public class User  implements Serializable {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
    private BigDecimal salary;
}