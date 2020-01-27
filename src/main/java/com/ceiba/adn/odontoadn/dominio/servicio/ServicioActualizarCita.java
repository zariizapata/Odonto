package com.ceiba.adn.odontoadn.dominio.servicio;

import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;

public class ServicioActualizarCita {
	public static final String CITA_PROGRAMADA = "El medico ya tiene una cita programada para esa fecha y hora";
	public static final String NOSABADODOMINGO = "Los dias sabado y domingo no se presta atencion";
	public static final String ERRORFECHA = "Error en fecha ingresada";
	public static final String NOBLANQUEAMIENTO = "Los dias miercoles no se realizan blanqueamientos";
	public static final String BLANQUEAMIENTO = "Blanqueamiento";
	public static final String REPARACIONES = "Reparaciones esteticas";
	public static final String PATTERN = "dd/MM/yyyy";

	private RepositorioCitas repositorioOdonto;

	public ServicioActualizarCita(RepositorioCitas repositorioOdonto) {
		this.repositorioOdonto = repositorioOdonto;
	}

	public Cita ejecutarActualizarCita(Cita odonto) {
		return this.repositorioOdonto.crear(odonto);
	}

	

	

}
