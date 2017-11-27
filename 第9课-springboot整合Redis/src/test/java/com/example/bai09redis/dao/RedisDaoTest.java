package com.example.bai09redis.dao;

import com.example.bai09redis.Bai09redisApplicationTests;
import org.junit.Test;

import javax.annotation.Resource;

public class RedisDaoTest extends Bai09redisApplicationTests {

    @Resource
    RedisDao redisDao;
    @Test
    public void testRedis(){
        redisDao.setKey("name","forezp");
        redisDao.setKey("age","11");
        logger.info(redisDao.getValue("name"));
        logger.info(redisDao.getValue("age"));
    }

    @Test
    public void testBai(){
        logger.info(redisDao.getValue("bai"));
    }
}
