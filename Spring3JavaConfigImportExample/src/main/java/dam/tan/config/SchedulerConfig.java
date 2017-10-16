package dam.tan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dam.tan.core.SchedulerBo;

@Configuration
public class SchedulerConfig {
	@Bean(name="schedulerBo")
	public SchedulerBo schedulerBo() {
		return new SchedulerBo();
	}
}
