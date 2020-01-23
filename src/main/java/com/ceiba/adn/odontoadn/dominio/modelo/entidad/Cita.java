package com.ceiba.adn.odontoadn.dominio.modelo.entidad;

import java.text.ParseException;
import java.util.Date;

import com.ceiba.adn.odontoadn.dominio.utilidades.FormatoFecha;

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

	private FormatoFecha formatoFecha;

	public Cita() {
		
	}

	public Cita(String fechaAsignacionCita, String horaAsingacionCita, String cedulaPacienite, String nombrePaciente,
			String tipoServicio, String estadoCita, String medicoAsignado, String telefonoContacto,
			String tarifaCancelar) {
		this.formatoFecha = new FormatoFecha();
		this.fechaAsignacionCita = this.formatoFecha.formatearFechaDate(fechaAsignacionCita);
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

	public String getHoraAsingacionCita() {
		return horaAsingacionCita;
	}

	public String getCedulaPacienite() {
		return cedulaPacienite;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public String getEstadoCita() {
		return estadoCita;
	}

	public String getMedicoAsignado() {
		return medicoAsignado;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public String getTarifaCancelar() {
		return tarifaCancelar;
	}

	public void setFechaAsignacionCita(Date date) {
		this.fechaAsignacionCita = date;
	}

	public void setHoraAsingacionCita(String horaAsingacionCita) {
		this.horaAsingacionCita = horaAsingacionCita;
	}

	public void setCedulaPacienite(String cedulaPacienite) {
		this.cedulaPacienite = cedulaPacienite;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public void setEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
	}

	public void setMedicoAsignado(String medicoAsignado) {
		this.medicoAsignado = medicoAsignado;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public void setTarifaCancelar(String tarifaCancelar) {
		this.tarifaCancelar = tarifaCancelar;
	}

}
