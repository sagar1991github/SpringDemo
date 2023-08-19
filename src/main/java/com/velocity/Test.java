package com.velocity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	 @SuppressWarnings("resource")
	ApplicationContext ioc =  new ClassPathXmlApplicationContext("applicationContext.xml");
      Student student =(Student) ioc.getBean("stud");
      System.out.println(student);
	}

}
