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

}
