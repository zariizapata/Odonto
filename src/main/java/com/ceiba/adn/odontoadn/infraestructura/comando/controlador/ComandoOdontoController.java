package com.ceiba.adn.odontoadn.infraestructura.comando.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.odontoadn.aplicacion.comando.ComandoOdonto;
import com.ceiba.adn.odontoadn.aplicacion.comando.manejador.ManejadorCrearOdonto;
import com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.ComandoRespuesta;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/odonto")
@Api(tags = { "Controller crear citas odontologicas"})
public class ComandoOdontoController {
	
	private final ManejadorCrearOdonto manejadorCrearOdonto;	
	
	
	public ComandoOdontoController(ManejadorCrearOdonto manejadorCrearOdonto) {
		this.manejadorCrearOdonto = manejadorCrearOdonto;
		
	}
	
	@PostMapping
	@ApiOperation("Crear Servicio Odontologia")
	public ComandoRespuesta<ComandoOdonto> post(@RequestBody ComandoOdonto comandoOdonto){
		return this.manejadorCrearOdonto.ejecutar(comandoOdonto);
	}
	
	
}
