package com.ceiba.adn.odontoadn.aplicacion.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoOdonto {

	private String fechaAsignacionCita;
	private String horaAsingacionCita;
	private String cedulaPacienite;
	private String nombrePaciente;
	private String tipoServicio;
	private String estadoCita;
	private String medicoAsignado;
	private String telefonoContacto;
	private String tarifaCancelar;
	
	
	
	public String getFechaAsignacionCita() {
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
	public void setFechaAsignacionCita(String fechaAsignacionCita) {
		this.fechaAsignacionCita = fechaAsignacionCita;
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

