package com.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	    ApplicationContext ioc= new ClassPathXmlApplicationContext("Spring.xml");
		Category bean =(Category)  ioc.getBean("categories");
		bean.show();

	    
	    //second programm
	   // Policy bean =(Policy) ioc.getBean("policy");
	  //  System.out.println(bean.getAmount()+","+bean.getName());
	}

}
