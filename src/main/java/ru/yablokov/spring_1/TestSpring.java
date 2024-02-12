package ru.yablokov.spring_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TestBean testBean = context.getBean("testBean", TestBean.class);
		
		System.out.print(testBean.getName());
		
		context.close();
	}
}
