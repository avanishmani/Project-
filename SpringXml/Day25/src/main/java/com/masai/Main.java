package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("a1.xml");
MyBusiness obj= ctx.getBean("mb",MyBusiness.class);
obj.fun1();
	}

}
