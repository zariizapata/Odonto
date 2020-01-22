package com.ceiba.adn.odontoadn.aplicacion.comando.manejador;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.fabrica.FabricaCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.mapeador.MapeadorCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.ComandoRespuesta;
import com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.manejadorcomandorespuesta.ManejadorComandoRespuesta;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioCrearCita;

@Component
public class ManejadorCrearCita implements ManejadorComandoRespuesta<ComandoCita, ComandoRespuesta<ComandoCita>> {

	private final ServicioCrearCita servicioCrearOdonto;
	private final FabricaCita fabricaOdonto;
	private static final MapeadorCita mapeador = MapeadorCita.getInstance();

	public ManejadorCrearCita(ServicioCrearCita servicioCrearOdonto, FabricaCita fabricaOdonto) {
		this.servicioCrearOdonto = servicioCrearOdonto;
		this.fabricaOdonto = fabricaOdonto;
	}

	public ComandoRespuesta<ComandoCita> ejecutar(ComandoCita comandoOdonto) {
		Cita odonto = this.fabricaOdonto.crearOdonto(comandoOdonto);
		return new ComandoRespuesta<ComandoCita>(mapeador.aComando(servicioCrearOdonto.ejecutarCrearCita(odonto)));
	}

}
