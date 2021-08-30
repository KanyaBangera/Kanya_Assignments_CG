package Que9;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Your message :" +message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	void init() {
		System.out.println("Bean is now initialized");
	}
	void destory() {
		System.out.println("Bean will be destroyed now");
	}
}
