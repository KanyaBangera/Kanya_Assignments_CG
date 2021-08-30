package Que9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Que9_spring.xml");
		HelloWorld object= (HelloWorld) context.getBean("HelloWorld");
		object.getMessage();
		context.registerShutdownHook();

	}

}
