package com.ceiba.adn.odontoadn.dominio.modelo.entidad;

import java.util.Date;

public class Cita {
	private Date fechaAsignacionCita;
	private String horaAsingacionCita;
	private String cedulaPacienite;
	private String nombrePaciente;
	private String tipoServicio;
	private String estadoCita;
	private String medicoAsignado;
	private String telefonoContacto;
	private String tarifaCancelar;

	public Cita() {

	}

	public Cita(String horaAsingacionCita, String cedulaPacienite, String nombrePaciente, String tipoServicio,
			String estadoCita, String medicoAsignado, String telefonoContacto, String tarifaCancelar,
			Date fechaAsignacionCita) {
		this.fechaAsignacionCita = fechaAsignacionCita;
		this.horaAsingacionCita = horaAsingacionCita;
		this.cedulaPacienite = cedulaPacienite;
		this.nombrePaciente = nombrePaciente;
		this.tipoServicio = tipoServicio;
		this.estadoCita = estadoCita;
		this.medicoAsignado = medicoAsignado;
		this.telefonoContacto = telefonoContacto;
		this.tarifaCancelar = tarifaCancelar;
	}

	public Date getFechaAsignacionCita() {
		return fechaAsignacionCita;
	}

	public void setFechaAsignacionCita(Date fechaAsignacionCita) {
		this.fechaAsignacionCita = fechaAsignacionCita;
	}

	public String getHoraAsingacionCita() {
		return horaAsingacionCita;
	}

	public void setHoraAsingacionCita(String horaAsingacionCita) {
		this.horaAsingacionCita = horaAsingacionCita;
	}

	public String getCedulaPacienite() {
		return cedulaPacienite;
	}

	public void setCedulaPacienite(String cedulaPacienite) {
		this.cedulaPacienite = cedulaPacienite;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getEstadoCita() {
		return estadoCita;
	}

	public void setEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
	}

	public String getMedicoAsignado() {
		return medicoAsignado;
	}

	public void setMedicoAsignado(String medicoAsignado) {
		this.medicoAsignado = medicoAsignado;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getTarifaCancelar() {
		return tarifaCancelar;
	}

	public void setTarifaCancelar(String tarifaCancelar) {
		this.tarifaCancelar = tarifaCancelar;
	}

}
