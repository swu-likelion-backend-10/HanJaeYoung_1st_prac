package LikeLionPrac01.prac01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@PropertySource("classpath:/env.properties")
public class Prac01Application {

	public static void main(String[] args) {
		SpringApplication.run(Prac01Application.class, args);
	}

}
