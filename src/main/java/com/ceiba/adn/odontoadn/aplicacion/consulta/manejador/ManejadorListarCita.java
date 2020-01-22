package com.ceiba.adn.odontoadn.aplicacion.consulta.manejador;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaCita;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioListarCitas;

@Component
public class ManejadorListarCita {

	private final ServicioListarCitas servicioListarOdonto;

	public ManejadorListarCita(ServicioListarCitas servicioListarOdonto) {
		this.servicioListarOdonto = servicioListarOdonto;
	}

	public List<ConsultaCita> ejecutar() {
		return this.servicioListarOdonto.listarConsultaOdonto();
	}

}
