package com.ceiba.adn.odontoadn.infraestructura.adaptador.repositorio.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;
import com.ceiba.adn.odontoadn.infraestructura.adaptador.entidad.OdontoEntidad;
import com.ceiba.adn.odontoadn.infraestructura.adaptador.mapeador.OdontoMapeador;
import com.ceiba.adn.odontoadn.infraestructura.adaptador.repositorio.jpa.OdontoJpa;

@Component
public class OdontoImpl implements RepositorioCitas {
	private static final OdontoMapeador odontoMapeador = OdontoMapeador.getInstance();

	private OdontoJpa odontoJpa;

	public OdontoImpl(OdontoJpa odontoJpa) {
		this.odontoJpa = odontoJpa;
	}

	@Override
	public Cita crear(Cita odonto) {
		OdontoEntidad odontoEntidad = odontoMapeador.aEntidad(odonto);
		return odontoMapeador.aDominio(odontoJpa.save(odontoEntidad));

	}

	@Override
	public boolean existe(Cita odonto) {

		return false;
	}

//3
	@Override
	public boolean validarDisponibilidadCita(String fecha, String hora, String medico) {
		return odontoJpa.validarfechasJpa(fecha, hora, medico) > 0;
	}

	@Override
	public List<ConsultaListarOdonto> listarConsultaOdonto() {
		return odontoJpa.listarConsultaOdonto();
	}

	@Override
	public ConsultaListarOdonto buscarConsultaOdonto(Long id) {
		return odontoJpa.buscarConsultaOdonto(id);
	}

	

}
