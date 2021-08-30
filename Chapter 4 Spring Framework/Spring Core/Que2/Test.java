package Que2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Que2_spring.xml");
		Question question= (Question) context.getBean("Question");
		
		System.out.println("-----------*********-----------");
		question.answerList();
		
		System.out.println();
		System.out.println("-----------*********-----------");
		question.answerSet();
		
		System.out.println();
		System.out.println("-----------*********-----------");
		question.answerMap();
	
	}

}
