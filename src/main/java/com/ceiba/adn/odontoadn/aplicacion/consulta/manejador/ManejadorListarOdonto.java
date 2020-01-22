package com.ceiba.adn.odontoadn.aplicacion.consulta.manejador;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioListarOdonto;

@Component
public class ManejadorListarOdonto {

	private final ServicioListarOdonto servicioListarOdonto;

	public ManejadorListarOdonto(ServicioListarOdonto servicioListarOdonto) {
		this.servicioListarOdonto = servicioListarOdonto;
	}

	public List<ConsultaListarOdonto> ejecutar() {
		return this.servicioListarOdonto.listarConsultaOdonto();
	}

}
