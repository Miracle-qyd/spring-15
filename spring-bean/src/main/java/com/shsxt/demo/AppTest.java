package com.shsxt.demo;

import com.shsxt.spring.ApplicationContext;
import com.shsxt.spring.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {

		ApplicationContext act = new ClassPathXmlApplicationContext(
				"F:\\6Senior\\project\\spring\\spring-bean\\src\\main\\resources\\spring-context.xml");
		
		UserService u = (UserService) act.getBean("userService");

		u.print();

		UserService2 u2 = (UserService2) act.getBean("userService2");
		u2.print();

	}

}
