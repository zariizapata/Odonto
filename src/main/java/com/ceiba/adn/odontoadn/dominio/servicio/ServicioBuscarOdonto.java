package com.ceiba.adn.odontoadn.dominio.servicio;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;

public class ServicioBuscarOdonto {

	private RepositorioCitas repositorioOdonto;

	public ServicioBuscarOdonto(RepositorioCitas repositorioOdonto) {
		this.repositorioOdonto = repositorioOdonto;
	}

	public ConsultaListarOdonto buscarConsultaOdonto(Long id) {
		return this.repositorioOdonto.buscarConsultaOdonto(id);
	}

}
