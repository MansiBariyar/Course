package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee eob=new Employee();
		//eob.display();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Student eob=(Student) context.getBean("student");
		eob.display();
	}

}