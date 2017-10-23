package dam.tan.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.bean.CustomerService;

public class App1 {
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"Spring-Prototype-Configuration.xml","Spring-Singleton-Configuration.xml"});
		
		//====================== Singleton Bean Scope =================
		// Singleton - tra ra mot the hien bean tren moi Spring IoC container
		CustomerService custA = (CustomerService) appContext.getBean("CustomerServiceSingleton");
		custA.setMessage("Message by custA");
		System.out.println("Message: "+custA.getMessage());
		
		// lay lai no mot lan nua
		CustomerService custB = (CustomerService) appContext.getBean("CustomerServiceSingleton");
		custB.setMessage("Message by custB");
		System.out.println("Message: "+custB.getMessage());
		
		CustomerService custH = (CustomerService) appContext.getBean("CustomerServiceSingleton");
		System.out.println("Message: "+custH.getMessage());
		//===============End Singleton Bean Scope==============================
		
		
		//===================== prototype bean scope ============================
		// prototype - trar ra mot the hien bean moi moi lan duoc request
		CustomerService custC = (CustomerService) appContext.getBean("CustomerServicePrototype");
		custC.setMessage("Message by custC");
		System.out.println("Message: "+custC.getMessage());
		
		CustomerService custD = (CustomerService) appContext.getBean("CustomerServicePrototype");
		System.out.println("Message: "+custD.getMessage());
		
		CustomerService custE = (CustomerService) appContext.getBean("CustomerServicePrototype");
		custE.setMessage("Message by custE");
		System.out.println("Message: "+custE.getMessage());
		// ============================ End prototype scope ======================
		
	}
}
