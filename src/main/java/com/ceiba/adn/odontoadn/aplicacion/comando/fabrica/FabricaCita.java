package com.ceiba.adn.odontoadn.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoCita;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;

@Component
public class FabricaCita {

	public Cita crearOdonto(ComandoCita comandoCita) {
		return new Cita(comandoCita.getHora(),
				comandoCita.getCedula(), comandoCita.getNombre(), comandoCita.getTipo(),
				comandoCita.getEstado(), comandoCita.getMedico(), comandoCita.getTelefono(),
				comandoCita.getTarifa(), comandoCita.getFecha());
	}

	
}
