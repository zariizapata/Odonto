package com.ceiba.adn.odontoadn.dominio.servicio;

import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Odonto;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioOdonto;

public class ServicioActualizarOdonto {
private RepositorioOdonto repositorioOdonto;
	
	public ServicioActualizarOdonto(RepositorioOdonto repositorioOdonto) {
		this.repositorioOdonto = repositorioOdonto;
	}
	
	public Odonto ejecutar(Odonto odonto) {
		return this.repositorioOdonto.crear(odonto);
	}

}
