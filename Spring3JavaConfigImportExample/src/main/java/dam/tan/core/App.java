package dam.tan.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dam.tan.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		customer.printMsg("Test");
		
		SchedulerBo schedulerBo = (SchedulerBo) appContext.getBean("schedulerBo");
		schedulerBo.printMsg("Test");
	}
}
