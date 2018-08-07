package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanCollections.xml");
	      CollectionsExample hw1 = (CollectionsExample) context.getBean("c");
	      System.out.println(hw1.getCityList());
	      System.out.println(hw1.getCityMap());
	      System.out.println(hw1.getCityProp());
	      System.out.println(hw1.getCityProp());
	     
	}

}
