package dam.tan.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.utils.OutputHelper;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Configuration.xml");
		OutputHelper output = (OutputHelper) appContext.getBean("OutputHelper");
		output.generateOutput();
	}
}
