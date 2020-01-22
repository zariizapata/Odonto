package com.ceiba.adn.odontoadn.dominio.puerto.repositorio;

import java.util.List;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaCita;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;

public interface RepositorioCitas {

	public Cita crear(Cita odonto);

	boolean existe(Cita odonto);

	public boolean validarDisponibilidadCita(String fecha, String hora, String medico);

	public List<ConsultaCita> listarConsultaOdonto();

	public ConsultaCita buscarConsultaOdonto(Long id);

}
