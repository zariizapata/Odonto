package com.ceiba.adn.odontoadn.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoCita;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;

@Component
public class FabricaCita {

	public Cita crearOdonto(ComandoCita comandoCita) {
		return new Cita(comandoCita.getFechaAsignacionCita(), comandoCita.getHoraAsingacionCita(),
				comandoCita.getCedulaPacienite(), comandoCita.getNombrePaciente(), comandoCita.getTipoServicio(),
				comandoCita.getEstadoCita(), comandoCita.getMedicoAsignado(), comandoCita.getTelefonoContacto(),
				comandoCita.getTarifaCancelar());
	}
}
