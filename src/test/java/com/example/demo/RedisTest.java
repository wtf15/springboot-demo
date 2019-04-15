package com.example.demo;

import com.example.demo.bean.User;
import com.example.demo.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wtf
 * @date 2019/4/12 15:13
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisUtil redisUtil;
    @Test
    public void test(){
        User user = new User();
        user.setUserName("wtfTest");
        user.setAge(18);
        user.setPassword("123");
        // 像redis中保存数据
        redisUtil.valuePut("test:a1", user);
        User userRedis = (User) redisUtil.getValue("test:a1");
        System.out.println(userRedis);
    }
}
