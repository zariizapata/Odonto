package com.ceiba.adn.odontoadn.infraestructura.comando.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adn.odontoadn.dominio.comando.puerto.repositorio.RepositorioOdonto;
import com.ceiba.adn.odontoadn.dominio.comando.servicio.ServicioBuscarOdonto;
import com.ceiba.adn.odontoadn.dominio.comando.servicio.ServicioCrearOdonto;
import com.ceiba.adn.odontoadn.dominio.comando.servicio.ServicioListarOdonto;

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
