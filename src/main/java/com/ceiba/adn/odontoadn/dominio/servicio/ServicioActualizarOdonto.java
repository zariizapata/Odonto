package com.ceiba.adn.odontoadn.dominio.servicio;

import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;

public class ServicioActualizarOdonto {
private RepositorioCitas repositorioOdonto;
	
	public ServicioActualizarOdonto(RepositorioCitas repositorioOdonto) {
		this.repositorioOdonto = repositorioOdonto;
	}
	
	public Cita ejecutar(Cita odonto) {
		return this.repositorioOdonto.crear(odonto);
	}

}
