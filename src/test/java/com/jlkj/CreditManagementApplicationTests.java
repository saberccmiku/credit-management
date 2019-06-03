package com.jlkj;


import com.jlkj.service.Impl.UserServiceImpl;
import com.jlkj.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditManagementApplicationTests {
	@Autowired
	UserServiceImpl userService;
	@Test
	public void contextLoads() {
		System.out.println(userService.query());
	}

}
