package com.ceiba.adn.odontoadn.dominio.servicio;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioOdonto;

public class ServicioBuscarOdonto {

	private RepositorioOdonto repositorioOdonto;

	public ServicioBuscarOdonto(RepositorioOdonto repositorioOdonto) {
		this.repositorioOdonto = repositorioOdonto;
	}

	public ConsultaListarOdonto buscarConsultaOdonto(Long id) {
		return this.repositorioOdonto.buscarConsultaOdonto(id);
	}

}
