package dam.tan.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dam.tan.helper.PersonHelper;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Bean.xml");
		PersonHelper personHelper = (PersonHelper) appContext.getBean("PersonHelper");
		personHelper.showJobOfPerson();
	}
}
