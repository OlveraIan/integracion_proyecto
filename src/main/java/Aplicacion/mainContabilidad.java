package Aplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication
public class mainContabilidad {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(mainContabilidad.class);
		app.setApplicationStartup(new BufferingApplicationStartup(2048));
		app.run(args);

	}

}