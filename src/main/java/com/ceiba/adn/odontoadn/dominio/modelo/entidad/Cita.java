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

	

}
