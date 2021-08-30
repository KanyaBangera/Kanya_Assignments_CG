package Que10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Que10_spring.xml");
		Triangle triangle = (Triangle) context.getBean("Triangle");
		triangle.draw();

	}

}
