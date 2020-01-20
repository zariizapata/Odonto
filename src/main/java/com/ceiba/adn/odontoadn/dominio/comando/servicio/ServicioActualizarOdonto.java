package com.ceiba.adn.odontoadn.dominio.comando.servicio;

import com.ceiba.adn.odontoadn.dominio.comando.modelo.entidad.Odonto;
import com.ceiba.adn.odontoadn.dominio.comando.puerto.repositorio.RepositorioOdonto;

public class ServicioActualizarOdonto {
private RepositorioOdonto repositorioOdonto;
	
	public ServicioActualizarOdonto(RepositorioOdonto repositorioOdonto) {
		this.repositorioOdonto = repositorioOdonto;
	}
	
	public Odonto ejecutar(Odonto odonto) {
		return this.repositorioOdonto.crear(odonto);
	}

}
