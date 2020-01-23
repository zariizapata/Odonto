package com.ceiba.adn.odontoadn.dominio.comando.servicio;

import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.utilidades.FormatoFecha;

public class OdontoTestCase {

	private String fecha;
	private String medico;
	private String hora;
	private String cedula;
	private String nombre;
	private String tarifa;
	private String tiposervicio;
	private String estadoCita;
	private String telefono;
	
	FormatoFecha formatofecha;

	public OdontoTestCase() {
		this.formatofecha= new FormatoFecha();
	}

	public OdontoTestCase conFecha(String fecha) {
		this.fecha = fecha;
		return this;
	}
	public OdontoTestCase conMedico(String medico) {
		this.medico = medico;
		return this;
	}
	public OdontoTestCase conhora(String hora) {
		this.hora = hora;
		return this;
	}
	
	public OdontoTestCase conNombre(String nombre) {
		this.nombre=nombre;
		return this;
	}
	public OdontoTestCase conCedula(String cedula) {
		this.cedula=cedula;
		return this;
	}
	public OdontoTestCase conTarifa(String tarifa) {
		this.tarifa=tarifa;
		return this;
	}
	public OdontoTestCase conTipoServicio(String tiposervicio) {
		this.tiposervicio = tiposervicio;
		return this;
	}
	
	public OdontoTestCase conEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
		return this;
	}
	public OdontoTestCase conTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}
	
	public Cita build() {
		Cita odonto = new Cita();
		odonto.setFechaAsignacionCita(this.formatofecha.formatearFechaDate(this.fecha));
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

