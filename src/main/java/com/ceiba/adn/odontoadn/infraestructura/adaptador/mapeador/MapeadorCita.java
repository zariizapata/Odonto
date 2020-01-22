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
		dominio.setFechaAsignacionCita(entidad.getFechaAsignacionCita());
		dominio.setHoraAsingacionCita(entidad.getHoraAsingacionCita());
		dominio.setCedulaPacienite(entidad.getCedulaPacienite());
		dominio.setNombrePaciente(entidad.getNombrePaciente());
		dominio.setTipoServicio(entidad.getTipoServicio());
		dominio.setEstadoCita(entidad.getEstadoCita());
		dominio.setMedicoAsignado(entidad.getMedicoAsignado());
		dominio.setTelefonoContacto(entidad.getTelefonoContacto());
		dominio.setTarifaCancelar(entidad.getTarifaCancelar());
		return dominio;
	}

	public EntidadCita aEntidad(Cita dominio) {
		EntidadCita entidad = new EntidadCita();
		entidad.setFechaAsignacionCita(dominio.getFechaAsignacionCita());
		entidad.setHoraAsingacionCita(dominio.getHoraAsingacionCita());
		entidad.setCedulaPacienite(dominio.getCedulaPacienite());
		entidad.setNombrePaciente(dominio.getNombrePaciente());
		entidad.setTipoServicio(dominio.getTipoServicio());
		entidad.setEstadoCita(dominio.getEstadoCita());
		entidad.setMedicoAsignado(dominio.getMedicoAsignado());
		entidad.setTelefonoContacto(dominio.getTelefonoContacto());
		entidad.setTarifaCancelar(dominio.getTarifaCancelar());
		return entidad;
	}

}
