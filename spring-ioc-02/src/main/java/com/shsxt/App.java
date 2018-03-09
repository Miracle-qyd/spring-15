package com.shsxt;


import java.awt.Desktop.Action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.bean.UserService;
import com.shsxt.bean.UserService2;

public class App {

	public static void main(String[] args) {
		//加载配置文件
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-context.xml");
		
		UserService userService = act.getBean(UserService.class);
		userService.print();
		
		UserService2 userService2 = act.getBean(UserService2.class);
		userService2.print();
	}
}
