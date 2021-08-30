package Que5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Que5_spring.xml"); 
        Employee employee = (Employee) context.getBean("Employee");
        System.out.println(employee.toString());

	}

}
