package com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.manejadorcomandorespuesta;

import javax.transaction.Transactional;

public interface ManejadorComandoRespuesta <C,R>{
	@Transactional
	R ejecutar(C command);

}
