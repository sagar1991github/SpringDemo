package com.Demo1;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext ioc =new ClassPathXmlApplicationContext("Spring2.xml");
		
        Drivers bean = ioc.getBean(Drivers.class);
        bean.show();
	}

}
