package com.api.clientes;

import com.api.clientes.modelo.Cliente;
import com.api.clientes.repositorios.ClienteRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiClientesApplication.class, args);
	}

	@Bean
	public CommandLineRunner addRegistrosPrueba(ClienteRepositorio repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Cliente(1L, "Carlos Cruz", "carlos@mail.com", 'M'));
			repository.save(new Cliente(2L, "Pedro Hernnández", "pedro@mail.com", 'M'));
			repository.save(new Cliente(3L, "Lidia Pérez", "lidpe@mail.com", 'F'));
			repository.save(new Cliente(4L, "Santiao Hernández", "santi@mail.com", 'M'));
			repository.save(new Cliente(5L, "Sandra de la Cruz", "sandy@mail.com", 'F'));
		};
	}

}
