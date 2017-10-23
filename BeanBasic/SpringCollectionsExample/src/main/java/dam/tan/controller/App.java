package dam.tan.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.beans.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Bean-Collection-Config.xml");
		Customer customer = (Customer) appContext.getBean("CustomerBean");
		System.out.println(customer);
	}
}
