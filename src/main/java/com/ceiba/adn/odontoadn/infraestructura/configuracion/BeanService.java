package com.ceiba.adn.odontoadn.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioBuscarCitas;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioCrearCita;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioListarCitas;

@Configuration
public class BeanService {

	@Bean
	public ServicioCrearCita servicioCrearOdonto(RepositorioCitas repositorioOdonto) {
		return new ServicioCrearCita(repositorioOdonto);
	}

	@Bean
	public ServicioListarCitas servicioListarCita(RepositorioCitas repositorioOdonto) {
		return new ServicioListarCitas(repositorioOdonto);
	}
	
	@Bean
	public ServicioBuscarCitas servicioBuscarCitas(RepositorioCitas repositorioOdonto) {
		return new ServicioBuscarCitas(repositorioOdonto);
	}

}
