package com.ceiba.adn.odontoadn.dominio.servicio;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaCita;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;

public class ServicioBuscarCitas {

	private RepositorioCitas repositorioCitas;

	public ServicioBuscarCitas(RepositorioCitas repositorioCitas) {
		this.repositorioCitas = repositorioCitas;
	}

	public ConsultaCita buscarCita(Long id) {
		return this.repositorioCitas.buscarConsultaOdonto(id);
	}

}
