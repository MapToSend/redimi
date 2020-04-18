package com.xcc.demo.redimi.controller;

import com.xcc.demo.redimi.config.Properties;
import com.xcc.demo.redimi.model.User;
import com.xcc.demo.redimi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate<String, User> redisTemplate;

    @Resource
    private Properties properties;



    @PostMapping("/reg")
    public String regUser(User user){

       int b= userService.addUser(user);

        return b==1 ?"数据插入成功" : "数据插入失败";
    }

    @GetMapping("/SMSlogin")
    public String loginSMS() {

        try {
            //接收图形码识别人工登录
            if (true) {

                //创建短信验证码 存储验证码到redis设置过期时间,

                //调用短信平台，发送短信，

            } else {
                //验证码识别不一致
            }
            //
        } catch (Exception e) {

            //短信发送失败
            e.printStackTrace();
        }

        return properties.toString();
    }

    @GetMapping("/redis")
    public String redisDemo() {
        User user = new User();
        user.setId(2);
        user.setPassWord("123456");
        user.setUserName("lisi");
        redisTemplate.opsForValue().set("saveUser", user, 1, TimeUnit.MINUTES);

        stringRedisTemplate.opsForValue().set("aaa", "bbb", 1, TimeUnit.MINUTES);

        return "redis存储数据";
    }

    @GetMapping("/getdata")
    public String redisDemo01() {
        boolean flag = stringRedisTemplate.opsForValue().get("aaa") != null;

        if (flag) {

            User saveUser = redisTemplate.opsForValue().get("saveUser");
            return stringRedisTemplate.opsForValue().get("aaa") + "+redis拿去数据+" + saveUser.toString();

        } else {

            return "数据已过期或者一消息";
        }

    }

    @GetMapping("/login/{id}")
    public User hello(@PathVariable("id") Integer id) {

        User user = userService.finUserById(id);

        System.out.println(user.toString());

        return user;
    }
}
