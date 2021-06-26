package com.easy.archiecture;


import com.easy.archiecture.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {


    /**
     * If you add a @Bean of your own of any of the auto-configured types
     * it will replace the default
     * (except in the case of RedisTemplate
     * the exclusion is based on the bean name ‘redisTemplate’ not its type).
     */
    @Resource
//	@Autowired
//	@Qualifier("redisTemplate")
    private RedisTemplate<String, User> redisTemplate;

    @Test
    public void test() throws Exception {

        // 保存字符串
//		stringRedisTemplate.opsForValue().set("aaa", "111");
//		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));

        // 保存对象
        User user = new User(1, "aaa", true);
        redisTemplate.opsForValue().set(user.getUserName(), user);
        user = new User(2, "bbb", true);
        redisTemplate.opsForValue().set(user.getUserName(), user);
        user = new User(3, "ccc", false);
        redisTemplate.opsForValue().set(user.getUserName(), user);

        Assert.assertEquals(1, redisTemplate.opsForValue().get("aaa").getId().intValue());
        Assert.assertEquals(2, redisTemplate.opsForValue().get("bbb").getId().intValue());
        Assert.assertEquals(3, redisTemplate.opsForValue().get("ccc").getId().intValue());
    }

}
