package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansCom.xml");
	      Computer comp = (Computer) context.getBean("comp");
	      System.out.println(comp.getName());
	      System.out.println(comp.c.getCPUBrand());
	}

}
