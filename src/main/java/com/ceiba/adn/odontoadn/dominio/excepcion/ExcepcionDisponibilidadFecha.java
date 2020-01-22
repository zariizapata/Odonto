package com.ceiba.adn.odontoadn.dominio.excepcion;

public class ExcepcionDisponibilidadFecha extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionDisponibilidadFecha(String mensaje) {
        super(mensaje);
    }
}
