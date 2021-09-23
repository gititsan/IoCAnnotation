package com.sana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Person p=context.getBean(Person.class);
		p.setName("Sana");
		System.out.println(" Name : "+p.getName());

	}

}
