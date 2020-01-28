package com.ceiba.adn.odontoadn.dominio.servicio;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.ceiba.adn.odontoadn.dominio.excepcion.ExcepcionDiasSinAtencion;
import com.ceiba.adn.odontoadn.dominio.excepcion.ExcepcionDisponibilidadFecha;
import com.ceiba.adn.odontoadn.dominio.excepcion.ExcepcionValorObligatorio;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;

public class ServicioCrearCita {
	public static final String CITA_PROGRAMADA = "El medico ya tiene una cita programada para esa fecha y hora";
	public static final String NOSABADODOMINGO = "Los dias sabado y domingo no se presta atencion";
	public static final String ERRORFECHA = "Error en fecha ingresada";
	public static final String NOBLANQUEAMIENTO = "Los dias miercoles no se realizan blanqueamientos";
	public static final String CAMPOSOBLIGATORIOS = "Cédula,nombre, medico,fecha,hora,tipo y tarifa son obligatorios";
	public static final String BLANQUEAMIENTO = "Blanqueamiento";
	public static final String REPARACIONES = "Reparaciones esteticas";
	public static final String PATTERN = "dd/MM/yyyy";
	public static final String VACIO="";

	private RepositorioCitas repositorioOdonto;

	public ServicioCrearCita(RepositorioCitas repositorioOdonto) {
		this.repositorioOdonto = repositorioOdonto;
	}

	public Cita ejecutarCrearCita(Cita odonto) {
		if(vacios(odonto)) {
			throw new ExcepcionDisponibilidadFecha(CAMPOSOBLIGATORIOS);
		}
		validarFecha(odonto.getFechaAsignacionCita(), odonto.getHoraAsingacionCita(), odonto.getMedicoAsignado());
		validarSabadoDomingo(odonto.getFechaAsignacionCita());
		validarBlanqueamientosmiercoles(odonto.getTipoServicio(), odonto.getFechaAsignacionCita());
		
		if(validarJueves(odonto.getFechaAsignacionCita(),odonto.getTipoServicio())) {
			int valor = Integer.parseInt(odonto.getTarifaCancelar());
			int intcalculo = valor / 2;
			odonto.setTarifaCancelar(Integer.toString(intcalculo));
		}
		return this.repositorioOdonto.crear(odonto);
	}

	private void validarFecha(Date fecha, String hora, String medico) {
		boolean existe = this.repositorioOdonto.validarDisponibilidadCita(fecha, hora, medico);
		if (existe) {
			throw new ExcepcionDisponibilidadFecha(CITA_PROGRAMADA);
		}
	}

	private void validarSabadoDomingo(Date hoy) {
		GregorianCalendar fechaCalendario = new GregorianCalendar();
		fechaCalendario.setTime(hoy);
		int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
		if (diaSemana == Calendar.SUNDAY || diaSemana == Calendar.SATURDAY) {
			throw new ExcepcionDiasSinAtencion(NOSABADODOMINGO);
		}
	}

	public void validarBlanqueamientosmiercoles(String tipoServicio, Date hoy) {
		GregorianCalendar fechaCalendario = new GregorianCalendar();
		fechaCalendario.setTime(hoy);
		int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
		if (diaSemana == Calendar.WEDNESDAY && tipoServicio.equals(BLANQUEAMIENTO)) {
			throw new ExcepcionDiasSinAtencion(NOBLANQUEAMIENTO);
		}

	}

	public boolean validarJueves(Date hoy,String tipoServicio) {
		GregorianCalendar fechaCalendario = new GregorianCalendar();
		fechaCalendario.setTime(hoy);
		int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
		return diaSemana == Calendar.THURSDAY && tipoServicio.equals(REPARACIONES);
		
	}
	
	public boolean vacios(Cita odonto) {
		Boolean validador=false;
		if(  odonto.getCedulaPacienite() == null || odonto.getCedulaPacienite().isEmpty()) {
			validador=true;
			return validador;
		}
		if(odonto.getFechaAsignacionCita().toString().equals(VACIO) || odonto.getFechaAsignacionCita() == null) {
			validador=true;
			return validador;
		}
		if(odonto.getEstadoCita() == null || odonto.getEstadoCita().isEmpty()  ) {
			validador=true;
			return validador;
		}
		if(odonto.getHoraAsingacionCita() == null || odonto.getHoraAsingacionCita().isEmpty()) {
			validador=true;
			return validador;
		}
		if(odonto.getMedicoAsignado() == null ||  odonto.getMedicoAsignado().isEmpty()) {
			validador=true;
			return validador;
		}
		if(odonto.getTarifaCancelar() == null || odonto.getTarifaCancelar().isEmpty()) {
			validador=true;
			return validador;
		}
		if(odonto.getTipoServicio() == null || odonto.getTipoServicio().isEmpty()) {
			validador=true;
			return validador;
		}
		
		
		return validador;
	}

}

