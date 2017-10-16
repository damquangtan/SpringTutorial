package dam.tan.java3config.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import dam.tan.java3config.helloworld.HelloWorld;
import dam.tan.java3config.helloworld.impl.HelloWorldImpl;

@Configurable
public class AppConfig {
	@Bean(name="helloBean")
	public HelloWorld getHelloWorld() {
		return new HelloWorldImpl();
	}
	
}
