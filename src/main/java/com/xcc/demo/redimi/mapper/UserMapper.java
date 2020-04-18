package com.xcc.demo.redimi.mapper;

import com.xcc.demo.redimi.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
 
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {
 
    User Sel(int id);

    //插入数据
    @Select("INSERT INTO USER  VALUES  (NULL,#{userName},#{passWord},#{realName},#{salary})")
    Integer addUser(User user);
}