package com.ceiba.adn.odontoadn.dominio.comando.excepcion;

public class ExcepcionDiasSinAtencion extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionDiasSinAtencion(String mensaje) {
        super(mensaje);
    }
}
