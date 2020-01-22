package com.ceiba.adn.odontoadn.aplicacion.consulta.manejador;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaCita;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioBuscarCitas;

@Component
public class ManejadorBuscarCita {

	private final ServicioBuscarCitas servicioBuscarCitas;

	public ManejadorBuscarCita(ServicioBuscarCitas servicioBuscarCitas) {
		this.servicioBuscarCitas = servicioBuscarCitas;
	}

	public ConsultaCita ejecutar(Long id) {
		return this.servicioBuscarCitas.buscarCita(id);
	}

}
