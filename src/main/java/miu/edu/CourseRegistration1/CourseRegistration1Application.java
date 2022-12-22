package miu.edu.CourseRegistration1;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;

@SpringBootApplication
@EnableRabbit
@Configuration
public class CourseRegistration1Application {


	public static void main(String[] args) {

		SpringApplication.run(CourseRegistration1Application.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
