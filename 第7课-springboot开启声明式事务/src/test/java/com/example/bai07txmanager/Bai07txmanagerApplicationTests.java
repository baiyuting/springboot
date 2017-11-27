package com.example.bai07txmanager;

import com.example.bai07txmanager.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Bai07txmanagerApplicationTests {

	@Resource
	private AccountService accountService;

	@Test
	public void contextLoads() {
		accountService.transfer();
	}

}
