package com.ceiba.adn.odontoadn.aplicacion.consulta.manejador;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioBuscarOdonto;

@Component
public class ManejadorBuscarOdonto {

	private final ServicioBuscarOdonto servicioBuscarOdonto;

	public ManejadorBuscarOdonto(ServicioBuscarOdonto servicioBuscarOdonto) {
		this.servicioBuscarOdonto = servicioBuscarOdonto;
	}

	public ConsultaListarOdonto ejecutar(Long id) {
		return this.servicioBuscarOdonto.buscarConsultaOdonto(id);
	}

}
