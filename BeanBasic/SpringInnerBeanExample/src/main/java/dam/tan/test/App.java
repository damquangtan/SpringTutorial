package dam.tan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.innerbean.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"Spring-Configuration.xml"});
		Customer customer1 = (Customer) appContext.getBean("CustomerBean");
		Customer customer2 = (Customer) appContext.getBean("CustomerBean1");
		System.out.println("Inner Bean with setter");
		System.out.println(customer1);
		System.out.println("-----------------------");
		System.out.println("Inner Bean with constructor");
		System.out.println(customer2);
	}
}
