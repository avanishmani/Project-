package com.Avanish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
MySpring mp= ap.getBean("mysp",MySpring.class);
mp.fun1();
	}

}
