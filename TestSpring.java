package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      WelcomeSpring obj = (WelcomeSpring) context.getBean("w1");
	      System.out.println(obj.getMsg());
	}

}
