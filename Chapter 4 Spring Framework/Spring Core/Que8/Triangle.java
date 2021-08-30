package Que8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.*;

public class Triangle implements InitializingBean, DisposableBean {
	private String type;
	private int height;
	
	public String getType() {
		return type;
	}
	

	public int getHeight() {
		return height;
	}

	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}


	public void draw() {
		System.out.println(" Drawing "+getType()+" Triangle of height " +getHeight() );
	}


	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init bean is called for triangle");
		
	}


	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy bean is called for triangle");
		
	}
	
	
	public void myinit() {
		System.out.println("myinit method called");
	}
		
	public void cleanup() {
		System.out.println("my destroy method called");
	}
	
	@PostConstruct
	public void PostConstruct() {
		System.out.println("PostConstruct method called");
	}
	@PreDestroy	
	public void PreDestroy() {
		System.out.println("PreDestroy method called");
	}
}
