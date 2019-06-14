package com.saber;


import com.saber.credit.entities.Menu;
import com.saber.credit.service.impl.MenuServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditManagementApplicationTests {
	@Autowired
	MenuServiceImpl menuService;
	@Test
	public void contextLoads() {
		System.out.println("-------------------------------分界线-------------------------------");
//		PageHelper.startPage(4-1,3);
//		List<Menu> menus = menuService.query(4,3);
//		PageInfo<Menu> pageInfo = new PageInfo<>(menus);
//		System.out.println(menus);
//		System.out.println(pageInfo.getTotal());

		List<Menu> menus = menuService.query();
		Map<String,List<Menu>> listMap = menus.stream().collect(Collectors.groupingBy(Menu::getPid));
		System.out.println(listMap);
		System.out.println("-------------------------------分界线-------------------------------");
	}

}
