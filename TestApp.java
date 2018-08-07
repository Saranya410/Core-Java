package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("BeansApp.xml");
	      SmartPhone sp = (SmartPhone) context.getBean("phn");
	      System.out.println(sp.getName());
	      System.out.println(sp.getPrice());
	      System.out.println(sp.app.getAppname());
	      System.out.println(sp.app.getApptype());
	}

}

 