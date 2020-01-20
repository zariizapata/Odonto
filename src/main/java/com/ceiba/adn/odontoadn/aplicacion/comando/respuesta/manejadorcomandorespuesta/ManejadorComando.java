package com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.manejadorcomandorespuesta;

import javax.transaction.Transactional;

public interface ManejadorComando<C> {
	@Transactional
	void ejecutar(C command);

}
