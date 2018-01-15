package dam.tan.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.bean.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Bean.xml");
		
		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
	}
}
