package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"core", "Controllers","Model", "Utility", "Backend"})
//@SpringBootApplication
@EnableMongoRepositories("Repository")
public class JobsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobsearchApplication.class, args);
	}
}
