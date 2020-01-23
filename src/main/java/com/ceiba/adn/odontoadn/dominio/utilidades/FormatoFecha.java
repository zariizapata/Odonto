package com.ceiba.adn.odontoadn.dominio.utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ceiba.adn.odontoadn.dominio.excepcion.ExcepcionValorObligatorio;

public class FormatoFecha {
	private static final String FORMATO_FECHA_INVALIDO="Error en fecha ingresada";

	public Date formatearFechaDate(String fechaConsulta) {
		try {
			SimpleDateFormat formatearFecha = new SimpleDateFormat("dd/MM/yyyy");
			return formatearFecha.parse(fechaConsulta);
		} catch (Exception e) {
			throw new ExcepcionValorObligatorio(FORMATO_FECHA_INVALIDO);
		}
	}

	public String formatearFechaString(Date fechaConsulta) {
		SimpleDateFormat formatearFecha = new SimpleDateFormat("dd/MM/yyyy");
		return formatearFecha.format(fechaConsulta);
	}
}
