package com.gxj.sharding.test;

import com.gxj.sharding.entity.User;
import com.gxj.sharding.service.StudentService;
import com.gxj.sharding.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试分库分表规则
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-database.xml", "classpath*:spring-sharding.xml" })
public class ShardingJdbcMybatisTest {

    @Resource
    UserService userService;

    @Resource
    StudentService studentService;

    @Test
    public void testUserInsert() {
        User u = new User();
        u.setUserId(11);
        u.setAge(25);
        u.setName("github");
        Assert.assertEquals(userService.insert(u), true);
    }

}
