package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanHello.xml");
	      HelloWorld hw1 = (HelloWorld) context.getBean("hw");
	      System.out.println(hw1.getMsg1());
	      System.out.println(hw1.getMsg2());
	      HelloIndia hi1 = (HelloIndia) context.getBean("hi");
	      System.out.println(hi1.getMsg1());
	      System.out.println(hi1.getMsg2());
	      System.out.println(hi1.getMsg3());
	}

}
