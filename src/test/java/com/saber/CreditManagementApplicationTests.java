package com.saber;


import com.saber.credit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditManagementApplicationTests {
	@Autowired
	UserService userService;
	@Test
	public void contextLoads() {
		System.out.println("-------------------------------分界线-------------------------------");
		System.out.println(userService.queryByUserIdOrPhone("大发发发"));
		System.out.println("-------------------------------分界线-------------------------------");
	}

}
