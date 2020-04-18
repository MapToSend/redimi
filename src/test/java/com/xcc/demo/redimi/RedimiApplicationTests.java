package com.xcc.demo.redimi;

import com.xcc.demo.redimi.mapper.UserMapper;
import com.xcc.demo.redimi.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class RedimiApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {

        BigDecimal bigDecimal1 = new BigDecimal(1.2);
        BigDecimal bigDecimal2 = new BigDecimal(6);
        System.out.println(bigDecimal1.add(bigDecimal2));
        System.out.println(bigDecimal1.add(bigDecimal2).setScale(2, BigDecimal.ROUND_HALF_DOWN));

    }


    @Test
    void aa(){

        User user = new User();
        user.setUserName("qqq");
        user.setRealName("www");
        user.setSalary(new BigDecimal(1.22));
        user.setPassWord("11111");
        Integer integer = userMapper.addUser(user);

        System.out.println("插入数据后返回的:"+integer);

    }


}
