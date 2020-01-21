package com.ceiba.adn.odontoadn.infraestructura.comando.adaptador.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tblcrearcitas")
public class OdontoEntidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "hora", nullable = false)
	private String hora;

	@Column(name = "cedula", nullable = false)
	private String cedula;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "tipo", nullable = false)
	private String tipo;

	@Column(name = "estado", nullable = false)
	private String estado;

	@Column(name = "medico", nullable = false)
	private String medico;

	@Column(name = "telefono", nullable = false)
	private String telefono;

	@Column(name = "tarifa", nullable = false)
	private String tarifa;

	@Column(name = "fecha", nullable = false)
	private String fecha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHoraAsingacionCita() {
		return hora;
	}

	public void setHoraAsingacionCita(String horaAsingacionCita) {
		this.hora = horaAsingacionCita;
	}

	public String getCedulaPacienite() {
		return cedula;
	}

	public void setCedulaPacienite(String cedulaPacienite) {
		this.cedula = cedulaPacienite;

	}

	public String getNombrePaciente() {
		return nombre;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombre = nombrePaciente;
	}

	public String getTipoServicio() {
		return tipo;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipo = tipoServicio;
	}

	public String getEstadoCita() {
		return estado;
	}

	public void setEstadoCita(String estadoCita) {
		this.estado = estadoCita;
	}

	public String getMedicoAsignado() {
		return medico;
	}

	public void setMedicoAsignado(String medicoAsignado) {
		this.medico = medicoAsignado;
	}

	public String getTelefonoContacto() {
		return telefono;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefono = telefonoContacto;
	}

	public String getTarifaCancelar() {
		return tarifa;
	}

	public void setTarifaCancelar(String tarifaCancelar) {
		this.tarifa = tarifaCancelar;
	}

	public String getFechaAsignacionCita() {
		return fecha;
	}

	public void setFechaAsignacionCita(String fechaAsignacionCita) {
		this.fecha = fechaAsignacionCita;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
