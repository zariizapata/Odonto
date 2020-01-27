package com.ceiba.adn.odontoadn.aplicacion.consulta;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ConsultaCita {

	private Long id;
	private Date fecha;
	private String hora;
	private String cedula;
	private String nombre;
	private String tipo;
	private String estado;
	private String medico;
	private String telefono;
	private String tarifa;

	

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public ConsultaCita(Long id, Date fecha, String hora, String cedula, String nombre, String tipo, String estado,
			String medico, String telefono, String tarifa) {
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.cedula = cedula;
		this.nombre = nombre;
		this.tipo = tipo;
		this.estado = estado;
		this.medico = medico;
		this.telefono = telefono;
		this.tarifa = tarifa;
	}

}
