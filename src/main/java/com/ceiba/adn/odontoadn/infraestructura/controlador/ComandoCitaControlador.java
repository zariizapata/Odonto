package com.ceiba.adn.odontoadn.infraestructura.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.manejador.ManejadorActualizarCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.manejador.ManejadorCrearCita;
import com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.ComandoRespuesta;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/odontologia")
@Api(tags = { "Controller crear citas odontologicas" })
public class ComandoCitaControlador {

	private final ManejadorCrearCita manejadorCrearCita;
	private final ManejadorActualizarCita manejadorActualizarCita;

	public ComandoCitaControlador(ManejadorCrearCita manejadorCrearOdonto,
			ManejadorActualizarCita manejadorActualizarCita) {
		this.manejadorCrearCita = manejadorCrearOdonto;
		this.manejadorActualizarCita=manejadorActualizarCita;

	}

	@PostMapping
	@ApiOperation("Crear Servicio Odontologia")
	public ComandoRespuesta<ComandoCita> post(@RequestBody ComandoCita comandoOdonto) {
		return this.manejadorCrearCita.ejecutar(comandoOdonto);
	}
	
	@PutMapping
	@ApiOperation("Actualizar servicio odontologico")
	public ComandoRespuesta<ComandoCita> put (@RequestBody ComandoCita comandoOdonto){
		return this.manejadorActualizarCita.ejecutar(comandoOdonto);
	}

	
	
}
