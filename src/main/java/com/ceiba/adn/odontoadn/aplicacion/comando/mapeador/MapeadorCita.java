package com.ceiba.adn.odontoadn.aplicacion.comando.mapeador;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoCita;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;

public final class MapeadorCita {
	
	private MapeadorCita() {
	}

	private static final MapeadorCita INSTANCE = new MapeadorCita();

	public static MapeadorCita getInstance() {
		return INSTANCE;
	}

	
	public ComandoCita aComando(Cita entidad) {
		ComandoCita dominio = new ComandoCita();
		dominio.setFecha(entidad.getFechaAsignacionCita());
		dominio.setHora(entidad.getHoraAsingacionCita());
		dominio.setCedula(entidad.getCedulaPacienite());
		dominio.setNombre(entidad.getNombrePaciente());
		dominio.setTipo(entidad.getTipoServicio());
		dominio.setEstado(entidad.getEstadoCita());
		dominio.setMedico(entidad.getMedicoAsignado());
		dominio.setTelefono(entidad.getTelefonoContacto());
		dominio.setTarifa(entidad.getTarifaCancelar());
		return dominio;
	}

}
