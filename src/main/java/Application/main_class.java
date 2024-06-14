package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class main_class {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(main_class.class);
		app.setApplicationStartup(new BufferingApplicationStartup(2048));
		app.run(args);

	}

}