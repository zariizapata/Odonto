package com.ceiba.adn.odontoadn.aplicacion.consulta;



public class ConsultaCita {
	private Long id;
	private String fecha;
	private String hora;
	private String cedula;
	private String nombre;
	private String tipo;
	private String estado;
	private String medico;
	private String telefono;
	private String tarifa;

	public ConsultaCita(Long id, String fechaAsignacionCita, String horaAsingacionCita, String cedulaPacienite,
			String nombrePaciente, String tipoServicio, String estadoCita, String medicoAsignado,
			String telefonoContacto, String tarifaCancelar) {

		this.id = id;
		this.fecha = fechaAsignacionCita;
		this.hora = horaAsingacionCita;
		this.cedula = cedulaPacienite;
		this.nombre = nombrePaciente;
		this.tipo = tipoServicio;
		this.estado = estadoCita;
		this.medico = medicoAsignado;
		this.telefono = telefonoContacto;
		this.tarifa = tarifaCancelar;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

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
	

	

}
