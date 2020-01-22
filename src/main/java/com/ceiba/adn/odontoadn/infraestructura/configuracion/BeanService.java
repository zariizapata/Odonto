package com.ceiba.adn.odontoadn.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioBuscarOdonto;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioCrearOdonto;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioListarOdonto;

@Configuration
public class BeanService {

	@Bean
	public ServicioCrearOdonto servicioCrearOdonto(RepositorioCitas repositorioOdonto) {
		return new ServicioCrearOdonto(repositorioOdonto);
	}

	@Bean
	public ServicioListarOdonto servicioListarOdonto(RepositorioCitas repositorioOdonto) {
		return new ServicioListarOdonto(repositorioOdonto);
	}
	
	@Bean
	public ServicioBuscarOdonto servicioBuscarOdonto(RepositorioCitas repositorioOdonto) {
		return new ServicioBuscarOdonto(repositorioOdonto);
	}

}
