package com.ceiba.adn.odontoadn.infraestructura.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaCita;
import com.ceiba.adn.odontoadn.aplicacion.consulta.manejador.ManejadorBuscarCita;
import com.ceiba.adn.odontoadn.aplicacion.consulta.manejador.ManejadorListarCita;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/odonto")
@Api(tags = { "Controller listar citas odontologicas"})
public class ConsultaCitasControlador {
	
	private final ManejadorListarCita manejadorListarOdonto;	
	private final ManejadorBuscarCita manejadorBuscarOdonto;
	
	
	public ConsultaCitasControlador(ManejadorListarCita manejadorListarOdonto,
			ManejadorBuscarCita manejadorBuscarOdonto) {
		this.manejadorListarOdonto = manejadorListarOdonto;	
		this.manejadorBuscarOdonto=manejadorBuscarOdonto;
	}
	
	@GetMapping
	@ApiOperation("Listar Servicio Odontologia")
	public List<ConsultaCita> get(){
		return this.manejadorListarOdonto.ejecutar();
	}
	
	@GetMapping("/{id}")
	@ApiOperation("Buscar Servicio Odontologia")
	public ConsultaCita getBuscarporid(@PathVariable Long id){
		return this.manejadorBuscarOdonto.ejecutar(id);
	}
	
}
