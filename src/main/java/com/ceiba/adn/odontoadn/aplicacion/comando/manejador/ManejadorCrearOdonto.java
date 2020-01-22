package com.ceiba.adn.odontoadn.aplicacion.comando.manejador;

import org.springframework.stereotype.Component;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoOdonto;
import com.ceiba.adn.odontoadn.aplicacion.comando.fabrica.FabricaOdonto;
import com.ceiba.adn.odontoadn.aplicacion.comando.mapeador.OdontoMapeador;
import com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.ComandoRespuesta;
import com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.manejadorcomandorespuesta.ManejadorComandoRespuesta;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioCrearOdonto;

@Component
public class ManejadorCrearOdonto implements ManejadorComandoRespuesta<ComandoOdonto,ComandoRespuesta<ComandoOdonto>> {

	private final ServicioCrearOdonto servicioCrearOdonto;
	private final FabricaOdonto fabricaOdonto;
	private static final OdontoMapeador mapeador = OdontoMapeador.getInstance();

	
	public ManejadorCrearOdonto(ServicioCrearOdonto servicioCrearOdonto,FabricaOdonto fabricaOdonto) {
		this.servicioCrearOdonto = servicioCrearOdonto;
		this.fabricaOdonto = fabricaOdonto;
	}
	
	public ComandoRespuesta<ComandoOdonto> ejecutar(ComandoOdonto comandoOdonto) {
		Cita odonto = this.fabricaOdonto.crearOdonto(comandoOdonto);
		return new ComandoRespuesta<ComandoOdonto>(mapeador.aComando(servicioCrearOdonto.ejecutar(odonto)));
	}
	
}
