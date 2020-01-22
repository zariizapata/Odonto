package com.ceiba.adn.odontoadn.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioOdonto;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioBuscarOdonto;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioCrearOdonto;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioListarOdonto;

@Configuration
public class BeanService {

	@Bean
	public ServicioCrearOdonto servicioCrearOdonto(RepositorioOdonto repositorioOdonto) {
		return new ServicioCrearOdonto(repositorioOdonto);
	}

	@Bean
	public ServicioListarOdonto servicioListarOdonto(RepositorioOdonto repositorioOdonto) {
		return new ServicioListarOdonto(repositorioOdonto);
	}
	
	@Bean
	public ServicioBuscarOdonto servicioBuscarOdonto(RepositorioOdonto repositorioOdonto) {
		return new ServicioBuscarOdonto(repositorioOdonto);
	}

}
