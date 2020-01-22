package com.ceiba.adn.odontoadn.infraestructura.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto;
import com.ceiba.adn.odontoadn.aplicacion.consulta.manejador.ManejadorBuscarOdonto;
import com.ceiba.adn.odontoadn.aplicacion.consulta.manejador.ManejadorListarOdonto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/odonto")
@Api(tags = { "Controller listar citas odontologicas"})
public class ConsultaOdontoController {
	
	private final ManejadorListarOdonto manejadorListarOdonto;	
	private final ManejadorBuscarOdonto manejadorBuscarOdonto;
	
	
	public ConsultaOdontoController(ManejadorListarOdonto manejadorListarOdonto,
			ManejadorBuscarOdonto manejadorBuscarOdonto) {
		this.manejadorListarOdonto = manejadorListarOdonto;	
		this.manejadorBuscarOdonto=manejadorBuscarOdonto;
	}
	
	@GetMapping
	@ApiOperation("Listar Servicio Odontologia")
	public List<ConsultaListarOdonto> get(){
		return this.manejadorListarOdonto.ejecutar();
	}
	
	@GetMapping("/{id}")
	@ApiOperation("Buscar Servicio Odontologia")
	public ConsultaListarOdonto getBuscarporid(@PathVariable Long id){
		return this.manejadorBuscarOdonto.ejecutar(id);
	}
	
}
