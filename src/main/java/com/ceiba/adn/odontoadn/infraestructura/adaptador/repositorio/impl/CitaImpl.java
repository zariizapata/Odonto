package com.ceiba.adn.odontoadn.infraestructura.adaptador.repositorio.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaCita;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;
import com.ceiba.adn.odontoadn.infraestructura.adaptador.entidad.EntidadCita;
import com.ceiba.adn.odontoadn.infraestructura.adaptador.mapeador.MapeadorCita;
import com.ceiba.adn.odontoadn.infraestructura.adaptador.repositorio.jpa.CitaJpa;

@Component
public class CitaImpl implements RepositorioCitas {
	private static final MapeadorCita odontoMapeador = MapeadorCita.getInstance();

	private CitaJpa odontoJpa;

	public CitaImpl(CitaJpa odontoJpa) {
		this.odontoJpa = odontoJpa;
	}

	@Override
	public Cita crear(Cita odonto) {
		EntidadCita odontoEntidad = odontoMapeador.aEntidad(odonto);
		return odontoMapeador.aDominio(odontoJpa.save(odontoEntidad));

	}

	@Override
	public boolean existe(Cita odonto) {

		return false;
	}

	@Override
	public boolean validarDisponibilidadCita(Date fecha, String hora, String medico) {
		return odontoJpa.validarfechasJpa(fecha, hora, medico) > 0;
	}

	@Override
	public List<ConsultaCita> listarConsultaOdonto() {
		return odontoJpa.listarConsultaOdonto();
	}

	@Override
	public ConsultaCita buscarConsultaOdonto(Long id) {
		return odontoJpa.buscarConsultaOdonto(id);
	}
	
	


}
