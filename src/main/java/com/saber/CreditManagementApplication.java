package com.saber;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(value = "com.saber.credit.mapper")
@EnableTransactionManagement(proxyTargetClass = true)
@SpringBootApplication
public class CreditManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditManagementApplication.class, args);
	}

}
