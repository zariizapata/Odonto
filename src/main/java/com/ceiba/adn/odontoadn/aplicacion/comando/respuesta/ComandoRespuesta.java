package com.ceiba.adn.odontoadn.aplicacion.comando.respuesta;

public class ComandoRespuesta<T> {
	private T value;

	public ComandoRespuesta(T value) {
	this.value = value;
	}

	public T getValue() {
	return value;
	}
}
