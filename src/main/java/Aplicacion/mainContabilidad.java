package Aplicacion;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "Endpoints,"+"https.registro_uv_mx.contabilidad,"+"Configuracion")
public class mainContabilidad {

	public static void main(String[] args) {
		
		SpringApplication.run(mainContabilidad.class, args);

	}

}