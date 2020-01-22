package com.ceiba.adn.odontoadn.dominio.servicio;

import java.util.List;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaCita;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;

public class ServicioListarCitas {

	private RepositorioCitas repositorioOdonto;

	public ServicioListarCitas(RepositorioCitas repositorioOdonto) {
		this.repositorioOdonto = repositorioOdonto;
	}

	public List<ConsultaCita> listarConsultaOdonto() {
		return this.repositorioOdonto.listarConsultaOdonto();
	}

}
