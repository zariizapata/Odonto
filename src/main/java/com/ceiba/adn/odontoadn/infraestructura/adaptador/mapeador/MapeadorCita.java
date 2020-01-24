package com.ceiba.adn.odontoadn.infraestructura.adaptador.mapeador;

import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.infraestructura.adaptador.entidad.EntidadCita;

public final class MapeadorCita {

	private MapeadorCita() {
	}

	private static final MapeadorCita INSTANCE = new MapeadorCita();

	public static MapeadorCita getInstance() {
		return INSTANCE;
	}

	public Cita aDominio(EntidadCita entidad) {
		Cita dominio = new Cita();
		dominio.setHoraAsingacionCita(entidad.getHora());
		dominio.setCedulaPacienite(entidad.getCedula());
		dominio.setNombrePaciente(entidad.getNombre());
		dominio.setTipoServicio(entidad.getTipo());
		dominio.setEstadoCita(entidad.getEstado());
		dominio.setMedicoAsignado(entidad.getMedico());
		dominio.setTelefonoContacto(entidad.getTelefono());
		dominio.setTarifaCancelar(entidad.getTarifa());
		dominio.setFechaAsignacionCita(entidad.getFecha());
		return dominio;
	}

	public EntidadCita aEntidad(Cita dominio) {
		EntidadCita entidad = new EntidadCita();
		entidad.setFecha(dominio.getFechaAsignacionCita());
		entidad.setHora(dominio.getHoraAsingacionCita());
		entidad.setCedula(dominio.getCedulaPacienite());
		entidad.setNombre(dominio.getNombrePaciente());
		entidad.setTipo(dominio.getTipoServicio());
		entidad.setEstado(dominio.getEstadoCita());
		entidad.setMedico(dominio.getMedicoAsignado());
		entidad.setTelefono(dominio.getTelefonoContacto());
		entidad.setTarifa(dominio.getTarifaCancelar());
		return entidad;
	}

}
