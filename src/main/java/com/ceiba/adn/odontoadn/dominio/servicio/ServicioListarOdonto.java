package com.ceiba.adn.odontoadn.dominio.servicio;

import java.util.List;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;

public class ServicioListarOdonto {

	private RepositorioCitas repositorioOdonto;

	public ServicioListarOdonto(RepositorioCitas repositorioOdonto) {
		this.repositorioOdonto = repositorioOdonto;
	}

	public List<ConsultaListarOdonto> listarConsultaOdonto() {
		return this.repositorioOdonto.listarConsultaOdonto();
	}

}
