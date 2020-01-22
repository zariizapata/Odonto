package com.ceiba.adn.odontoadn.infraestructura.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.manejador.ManejadorCrearCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.ComandoRespuesta;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/odonto")
@Api(tags = { "Controller crear citas odontologicas" })
public class ComandoCitaControlador {

	private final ManejadorCrearCita manejadorCrearCita;

	public ComandoCitaControlador(ManejadorCrearCita manejadorCrearOdonto) {
		this.manejadorCrearCita = manejadorCrearOdonto;

	}

	@PostMapping
	@ApiOperation("Crear Servicio Odontologia")
	public ComandoRespuesta<ComandoCita> post(@RequestBody ComandoCita comandoOdonto) {
		return this.manejadorCrearCita.ejecutar(comandoOdonto);
	}

}
