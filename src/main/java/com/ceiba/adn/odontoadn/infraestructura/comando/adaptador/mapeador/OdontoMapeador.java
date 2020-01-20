package com.ceiba.adn.odontoadn.infraestructura.comando.adaptador.mapeador;

import com.ceiba.adn.odontoadn.dominio.comando.modelo.entidad.Odonto;
import com.ceiba.adn.odontoadn.infraestructura.comando.adaptador.entidad.OdontoEntidad;

public final class OdontoMapeador {

	private OdontoMapeador() {
	}

	private static final OdontoMapeador INSTANCE = new OdontoMapeador();

	public static OdontoMapeador getInstance() {
		return INSTANCE;
	}

	public Odonto aDominio(OdontoEntidad entidad) {
		Odonto dominio = new Odonto();
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

	public OdontoEntidad aEntidad(Odonto dominio) {
		OdontoEntidad entidad = new OdontoEntidad();
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
