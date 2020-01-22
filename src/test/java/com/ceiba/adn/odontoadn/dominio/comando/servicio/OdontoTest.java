package com.ceiba.adn.odontoadn.dominio.comando.servicio;

import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Odonto;

public class OdontoTest {

	private String fecha;
	private String medico;
	private String hora;
	private String cedula;
	private String nombre;
	private String tarifa;
	private String tiposervicio;
	private String estadoCita;
	private String telefono;

	public OdontoTest() {
	}

	public OdontoTest conFecha(String fecha) {
		this.fecha = fecha;
		return this;
	}
	public OdontoTest conMedico(String medico) {
		this.medico = medico;
		return this;
	}
	public OdontoTest conhora(String hora) {
		this.hora = hora;
		return this;
	}
	
	public OdontoTest conNombre(String nombre) {
		this.nombre=nombre;
		return this;
	}
	public OdontoTest conCedula(String cedula) {
		this.cedula=cedula;
		return this;
	}
	public OdontoTest conTarifa(String tarifa) {
		this.tarifa=tarifa;
		return this;
	}
	public OdontoTest conTipoServicio(String tiposervicio) {
		this.tiposervicio = tiposervicio;
		return this;
	}
	
	public OdontoTest conEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
		return this;
	}
	public OdontoTest conTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}
	
	public Odonto build() {
		Odonto odonto = new Odonto();
		odonto.setFechaAsignacionCita(this.fecha);
		odonto.setHoraAsingacionCita(this.hora);
		odonto.setMedicoAsignado(this.medico);
		odonto.setTarifaCancelar(this.tarifa);
		odonto.setCedulaPacienite(this.cedula);
		odonto.setNombrePaciente(this.nombre);
		odonto.setTipoServicio(this.tiposervicio);
		odonto.setEstadoCita(this.estadoCita);
		odonto.setTelefonoContacto(this.telefono);
		return odonto;
	}
}

