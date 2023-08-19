package com.Demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	  
		ApplicationContext ioc = new ClassPathXmlApplicationContext("Spring1.xml");
          Customer bean= (Customer) ioc.getBean("c");
          System.out.println(bean);
	}

}
