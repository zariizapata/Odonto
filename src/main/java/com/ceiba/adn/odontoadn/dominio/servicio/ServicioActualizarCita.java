package com.ceiba.adn.odontoadn.dominio.servicio;

import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;

public class ServicioActualizarCita {
private RepositorioCitas repositorioOdonto;
	
	public ServicioActualizarCita(RepositorioCitas repositorioOdonto) {
		this.repositorioOdonto = repositorioOdonto;
	}
	
	public Cita ejecutar(Cita odonto) {
		return this.repositorioOdonto.crear(odonto);
	}

}
