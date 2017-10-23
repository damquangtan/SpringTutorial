package dam.tan.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.date.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"Spring-Factory-Bean.xml"});
/*		Customer custA = (Customer) appContext.getBean("customer");
		System.out.println(custA);
		System.out.println("================================");*/
		Customer custB = (Customer) appContext.getBean("customer1");
		System.out.println(custB);
	}
}
