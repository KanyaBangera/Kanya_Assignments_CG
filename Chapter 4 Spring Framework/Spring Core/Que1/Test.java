package Que1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Que1_spring.xml");
		Customer customer=(Customer) context.getBean("Customer");
		System.out.println(customer.getCustomerName()+" "+customer.getCustomerId()+" "+customer.getCustomerContact());
		System.out.println(customer.customerAddress.getCity()+" "+customer.customerAddress.getCountry()+" "+customer.customerAddress.getState()+" "+customer.customerAddress.getStreet()+" "+customer.customerAddress.getZip());
	}

}
