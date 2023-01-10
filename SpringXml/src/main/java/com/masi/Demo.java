package com.masi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {

		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		PersonServices ps=ctx.getBean(PersonServices.class);
		ps.printList();
}
}
