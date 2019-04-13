package application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("API")
@EnableJpaRepositories("Models")
@EntityScan("Models")
public class LittleChefApplication {

	public static void main(String[] args) {
		SpringApplication.run(LittleChefApplication.class, args);
	}

}