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

	private String hora;
	private String cedula;
	private String nombre;
	private String tipo;
	private String estado;
	private String medico;
	private String telefono;
	private String tarifa;
	private Date fecha;

	

}
