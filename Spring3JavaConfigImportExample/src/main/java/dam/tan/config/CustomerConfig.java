package dam.tan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dam.tan.core.CustomerBo;

@Configuration
public class CustomerConfig {
	@Bean(name="customerBo")
	public CustomerBo customerBo() {
		return new CustomerBo();
	}
}
