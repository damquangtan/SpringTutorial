package dam.tan.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.bean.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Bean.xml");
		
		Customer cust = (Customer) appContext.getBean("CustomerBean");
		System.out.println(cust);
		
		Customer cust1 = (Customer) appContext.getBean("VietNamBean");
		System.out.println(cust1);
		
		Customer cust2 = (Customer) appContext.getBean("BaseCustomerMalaysia");
		System.out.println(cust2);
	}
}
