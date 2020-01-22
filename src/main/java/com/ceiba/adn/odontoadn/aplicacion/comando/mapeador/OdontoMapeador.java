package com.ceiba.adn.odontoadn.aplicacion.comando.mapeador;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoOdonto;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;

public class OdontoMapeador {

private OdontoMapeador() {
}

	private static final OdontoMapeador INSTANCE = new OdontoMapeador();

	public static OdontoMapeador getInstance() {
		return INSTANCE;
	}

	public ComandoOdonto aComando(Cita entidad) {
		ComandoOdonto dominio = new ComandoOdonto();
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
