package com.ceiba.adn.odontoadn.dominio.comando.servicio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.ceiba.adn.odontoadn.dominio.excepcion.ExcepcionDiasSinAtencion;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;
import com.ceiba.adn.odontoadn.dominio.puerto.repositorio.RepositorioCitas;
import com.ceiba.adn.odontoadn.dominio.servicio.ServicioCrearOdonto;

public class ServicioCrearOdontoTest {

	private OdontoTest ticketBuilder;
	private Cita odonto;
	private RepositorioCitas parking;
	private ServicioCrearOdonto service;
	private static final String FECHA = "17/01/2020";
	private static final String FECHA_ERROR = "01-01-2020";
	private static final String FECHA_DOMINGO = "19/01/2020";
	private static final String FECHA_SABADO = "18/01/2020";
	private static final String HORA = "10:20";
	private static final String CEDULA = "1035432774";
	private static final String MEDICO = "Camilo Calderon";
	private static final String CITA_PROGRAMADA = "Ya hay una cita programada";
	private static final String NOMBRE = "SARA ZAPATA";
	private static final String BLANQUEAMIENTO = "Blanqueamiento";
	private static final String FECHA_MIERCOLES = "22/01/2020";
	private static final String FECHA_JUEVES = "23/01/2020";
	public static final String NOBLANQUEAMIENTO = "Los dias miercoles no se realizan blanqueamientos";
	public static final String ERRORFECHA = "Error en fecha ingresada";
	public static final String NOSABADODOMINGO = "Los dias sabado y domingo no se presta atencion";
	public static final String REPARACIONES = "Reparaciones esteticas";
	private static final String PENDIENTE = "Pendiente";
	private static final String TELEFONO = "41105050";
	private static final String TARIFA = "50000";
	private Date today;

	/**
	 * 
	 * Test el cual verifica que el ticket se creo correctamente para una moto
	 */
	@Before
	public void setUp() {
		// arrange
		this.parking = mock(RepositorioCitas.class);
		this.today = Calendar.getInstance().getTime();
	}

	@Test
	public void Crear() {
		this.ticketBuilder = new OdontoTest().conFecha(FECHA).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO).conEstadoCita(PENDIENTE)
				.conTelefono(TELEFONO).conTarifa(TARIFA);
		this.odonto = this.ticketBuilder.build();
		this.ticketBuilder = new OdontoTest().conFecha(FECHA).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conEstadoCita(PENDIENTE).conTelefono(TELEFONO).conTarifa(TARIFA);
		Cita odontoNew = this.ticketBuilder.build();
		when(this.parking.crear(this.odonto)).thenReturn(odontoNew);
		this.service = new ServicioCrearOdonto(this.parking);
		// act
		Cita responseTicket = this.service.ejecutar(this.odonto);
		// assert
		assertEquals(responseTicket, odontoNew);
	}

	@Test
	public void Domingo() {
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_DOMINGO).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO).conEstadoCita(PENDIENTE)
				.conTelefono(TELEFONO).conTarifa(TARIFA);
		this.odonto = this.ticketBuilder.build();
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_DOMINGO).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO).conEstadoCita(PENDIENTE)
				.conTelefono(TELEFONO).conTarifa(TARIFA);
		Cita odontoNew = this.ticketBuilder.build();
		when(this.parking.crear(this.odonto)).thenReturn(odontoNew);
		this.service = new ServicioCrearOdonto(this.parking);
		// act

		try {
			// act
			this.service.ejecutar(this.odonto);
			fail();
		} catch (ExcepcionDiasSinAtencion e) {
			// assert
			assertEquals(e.getMessage(), NOSABADODOMINGO);
		}

	}

	@Test
	public void Sabado() {
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_SABADO).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO);
		this.odonto = this.ticketBuilder.build();
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_SABADO).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO);
		;
		Cita odontoNew = this.ticketBuilder.build();
		when(this.parking.crear(this.odonto)).thenReturn(odontoNew);
		this.service = new ServicioCrearOdonto(this.parking);
		// act

		try {
			// act
			this.service.ejecutar(this.odonto);
			fail();
		} catch (ExcepcionDiasSinAtencion e) {
			// assert
			assertEquals(e.getMessage(), NOSABADODOMINGO);
		}

	}

	@Test
	public void Miercoles() {
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_MIERCOLES).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO);
		this.odonto = this.ticketBuilder.build();
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_MIERCOLES).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO);
		;
		Cita odontoNew = this.ticketBuilder.build();
		when(this.parking.crear(this.odonto)).thenReturn(odontoNew);
		this.service = new ServicioCrearOdonto(this.parking);
		// act

		try {
			// act
			this.service.ejecutar(this.odonto);
			fail();
		} catch (ExcepcionDiasSinAtencion e) {
			// assert
			assertEquals(e.getMessage(), NOBLANQUEAMIENTO);
		}

	}

	@Test
	public void jueves() {
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_JUEVES).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(REPARACIONES);
		this.odonto = this.ticketBuilder.build();
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_JUEVES).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(REPARACIONES);
		;
		Cita odontoNew = this.ticketBuilder.build();
		when(this.parking.crear(this.odonto)).thenReturn(odontoNew);
		this.service = new ServicioCrearOdonto(this.parking);
		assertEquals(this.service.validarJueves(FECHA_JUEVES, REPARACIONES), true);

	}

	@Test
	public void fechaerronea() {
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_ERROR).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO);
		this.odonto = this.ticketBuilder.build();
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_ERROR).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO);
		;
		Cita odontoNew = this.ticketBuilder.build();
		when(this.parking.crear(this.odonto)).thenReturn(odontoNew);
		this.service = new ServicioCrearOdonto(this.parking);
		// act

		try {
			// act
			this.service.ejecutar(this.odonto);
			fail();
		} catch (ExcepcionDiasSinAtencion e) {
			// assert
			assertEquals(e.getMessage(), ERRORFECHA);
		}

	}
	public void  validarFecha() {
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_ERROR).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO);
		this.odonto = this.ticketBuilder.build();
		this.ticketBuilder = new OdontoTest().conFecha(FECHA_ERROR).conCedula(CEDULA).conhora(HORA)
				.conMedico(MEDICO).conNombre(NOMBRE).conTipoServicio(BLANQUEAMIENTO);
		
		
		
	}

}
