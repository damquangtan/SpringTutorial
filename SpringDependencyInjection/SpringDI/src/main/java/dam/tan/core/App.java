package dam.tan.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.constructorinjection.ConstructorInjection;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Configuration.xml");
		
		ConstructorInjection out = (ConstructorInjection) appContext.getBean("ConstructorInjection");
	}
}
