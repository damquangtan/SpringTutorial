package dam.tan.java3config.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dam.tan.java3config.config.AppConfig;
import dam.tan.java3config.helloworld.HelloWorld;

// Load JavaConfig class with AnnotationConfigApplicationContext
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld hello = (HelloWorld) context.getBean("helloBean");
		hello.printHelloWorld("Spring3 Java Config");
	}
}
