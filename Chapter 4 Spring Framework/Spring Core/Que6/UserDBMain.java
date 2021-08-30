package Que6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDBMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Que6_spring.xml");
		UserDB user=context.getBean("UserDB", UserDB.class);
		System.out.println(user.toString());

	}

}
