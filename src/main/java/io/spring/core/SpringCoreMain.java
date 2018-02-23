package io.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreMain {

	public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	   HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	   System.out.println( obj.getMessage());
	   ((AbstractApplicationContext) context).close();
	}

}
