package crmdemoapi.crmdemoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("Controller")
@SpringBootApplication
public class CrmDemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmDemoApiApplication.class, args);
	}

}
