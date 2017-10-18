package dam.tan.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.helper.OutputHelper;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml","Spring-Bean.xml"});
		OutputHelper outputHelper = (OutputHelper) appContext.getBean("outputHelper");
		outputHelper.generateOutput();
	}
}
