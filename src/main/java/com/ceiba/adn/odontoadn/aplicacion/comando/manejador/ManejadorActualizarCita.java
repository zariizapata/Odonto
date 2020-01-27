package com.ceiba.adn.odontoadn.aplicacion.comando.manejador;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.fabrica.FabricaCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.mapeador.MapeadorCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.ComandoRespuesta;
import com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.manejadorcomandorespuesta.ManejadorComandoRespuesta;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioActualizarCita;

@Component
public class ManejadorActualizarCita implements ManejadorComandoRespuesta<ComandoCita, ComandoRespuesta<ComandoCita>> {

	private final ServicioActualizarCita servicioActualizarCita;
	private final FabricaCita fabricaOdonto;
	private static final MapeadorCita mapeador = MapeadorCita.getInstance();

	public ManejadorActualizarCita(ServicioActualizarCita servicioActualizarCita, FabricaCita fabricaOdonto) {
		this.servicioActualizarCita = servicioActualizarCita;
		this.fabricaOdonto = fabricaOdonto;
	}

	public ComandoRespuesta<ComandoCita> ejecutar(ComandoCita comandoOdonto) {
		Cita cita = this.fabricaOdonto.crearOdonto(comandoOdonto);
		return new ComandoRespuesta<ComandoCita>(mapeador.aComando(servicioActualizarCita.ejecutarActualizarCita(cita)));
	}

	
}
