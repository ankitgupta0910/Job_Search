package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"core", "Controllers","Model", "Repository", "Utility", "Backend"})
//@SpringBootApplication
@EnableJpaRepositories
public class JobsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobsearchApplication.class, args);
	}
}
