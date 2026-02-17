package in.n4smh.microservices.person.swagger_central;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = " in.n4smh.microservices")
public class PersonSwaggerCentralApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonSwaggerCentralApplication.class, args);
	}

}
