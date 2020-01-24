package com.ceiba.adn.odontoadn.aplicacion.comando;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComandoCita {

	private String horaAsingacionCita;
	private String cedulaPacienite;
	private String nombrePaciente;
	private String tipoServicio;
	private String estadoCita;
	private String medicoAsignado;
	private String telefonoContacto;
	private String tarifaCancelar;
	private Date fechaAsignacionCita;

}
