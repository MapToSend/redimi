package com.xcc.demo.redimi.controller;

import com.xcc.demo.redimi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/redis")
public class RedisController {

//    @Autowired
//    @Qualifier(value = "RedisTemplate<String, User>")
    @Resource
    private RedisTemplate<String, User> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/addHash")
    public String test01() {


        User user = new User();

        user.setPassWord("1111");
        user.setRealName("asdsad");
        redisTemplate.opsForHash().put("a", "b", user);

//        redisTemplate.expire()
        return "redis存储哈希";
    }

    @GetMapping("/getHash")
    public String test02(){
        User o = (User) redisTemplate.opsForHash().get("a", "b");

        return o.toString();
    }

}
