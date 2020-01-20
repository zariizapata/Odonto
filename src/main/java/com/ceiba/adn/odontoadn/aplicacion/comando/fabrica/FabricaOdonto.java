package com.ceiba.adn.odontoadn.aplicacion.comando.fabrica;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoOdonto;
import com.ceiba.adn.odontoadn.dominio.comando.modelo.entidad.Odonto;


@Component
public class FabricaOdonto {

	public Odonto crearOdonto(ComandoOdonto comandoOdonto) {
		return new Odonto(
				comandoOdonto.getFechaAsignacionCita(),
				comandoOdonto.getHoraAsingacionCita(),
				comandoOdonto.getCedulaPacienite(),
				comandoOdonto.getNombrePaciente(),
				comandoOdonto.getTipoServicio(),
				comandoOdonto.getEstadoCita(),
				comandoOdonto.getMedicoAsignado(),
				comandoOdonto.getTelefonoContacto(),
				comandoOdonto.getTarifaCancelar());
	}
}
