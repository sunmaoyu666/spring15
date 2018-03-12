package com.shsxt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 
		//加载文件夹
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-context.xml");
		UserService us = (UserService)act.getBean("userService");
		us.print();
	}
}
