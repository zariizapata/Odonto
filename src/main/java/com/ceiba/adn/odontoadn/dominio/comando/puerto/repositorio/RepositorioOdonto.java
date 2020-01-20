package com.ceiba.adn.odontoadn.dominio.comando.puerto.repositorio;

import java.util.List;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto;
import com.ceiba.adn.odontoadn.dominio.comando.modelo.entidad.Odonto;

public interface RepositorioOdonto {

	/**
	 * Permite crear las peliculas
	 * 
	 * @param pelicula
	 */
	public Odonto crear(Odonto odonto);

	/**
	 * Permite determinar si previamente se registro la pelicula
	 * 
	 * @param pelicula
	 * @return si existe o no
	 */
	boolean existe(Odonto odonto);

	// 1
	public boolean validarfechar(String fecha, String hora, String medico);


	public List<ConsultaListarOdonto> listarConsultaOdonto();
	
	public ConsultaListarOdonto buscarConsultaOdonto(Long id);

}
