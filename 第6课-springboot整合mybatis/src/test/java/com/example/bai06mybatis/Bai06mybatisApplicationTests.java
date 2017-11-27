package com.example.bai06mybatis;

import com.example.bai06mybatis.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Bai06mybatisApplicationTests {

	@Resource
	private AccountService accountService;

	@Test
	public void contextLoads() {
		accountService.add("ggg", 1000);
	}

}
