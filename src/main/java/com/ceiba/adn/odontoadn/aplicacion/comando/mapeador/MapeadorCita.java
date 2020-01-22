package com.ceiba.adn.odontoadn.aplicacion.comando.mapeador;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoCita;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;

public class MapeadorCita {

private MapeadorCita() {
}

	private static final MapeadorCita INSTANCE = new MapeadorCita();

	public static MapeadorCita getInstance() {
		return INSTANCE;
	}

	public ComandoCita aComando(Cita entidad) {
		ComandoCita dominio = new ComandoCita();
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

}
