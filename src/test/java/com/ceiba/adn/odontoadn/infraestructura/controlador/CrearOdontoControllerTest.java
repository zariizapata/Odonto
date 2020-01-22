package com.ceiba.adn.odontoadn.infraestructura.controlador;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ceiba.adn.odontoadn.ApplicationMock;
import com.ceiba.adn.odontoadn.OdontoadnApplication;
import com.ceiba.adn.odontoadn.dominio.comando.servicio.OdontoTest;
import com.ceiba.adn.odontoadn.dominio.excepcion.ExcepcionDisponibilidadFecha;
import com.ceiba.adn.odontoadn.dominio.modelo.entidad.Cita;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationMock.class)
@SpringBootTest(classes = OdontoadnApplication.class)
@AutoConfigureMockMvc
public class CrearOdontoControllerTest {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mvc;
	private static final String URL_TICKETS = "/api/odonto/";
	private static final String FECHA = "28/01/2020";
	private static final String HORA = "10:20";
	private static final String CEDULA = "1035432774";
	private static final String MEDICO = "Camilo Calderon";
	private static final String NOMBRE = "SARA ZAPATA";
	private static final String BLANQUEAMIENTO = "Blanqueamiento";
	public static final String NOBLANQUEAMIENTO = "Los dias miercoles no se realizan blanqueamientos";
	public static final String ERRORFECHA = "Error en fecha ingresada";
	public static final String NOSABADODOMINGO = "Los dias sabado y domingo no se presta atencion";
	public static final String REPARACIONES = "Reparaciones esteticas";
	private static final String PENDIENTE = "Pendiente";
	private static final String TELEFONO = "41105050";
	private static final String TARIFA = "50000";

	@Before
	public void setUp() {
		this.mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void getCitasProgramadas() throws Exception {
		this.mvc.perform(get(URL_TICKETS).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON));
	}

	@Test
	public void postTegistrarCita() throws Exception {
		OdontoTest odontoTest = new OdontoTest();
		odontoTest.conFecha(FECHA).conCedula(CEDULA).conEstadoCita(PENDIENTE).conhora(HORA).conMedico(MEDICO)
				.conNombre(NOMBRE).conTarifa(TARIFA).conTelefono(TELEFONO).conTipoServicio(BLANQUEAMIENTO);
		Cita odonto = odontoTest.build();
		JSONObject jsonTicketComman = new JSONObject(odonto);
		String exceptionName = ExcepcionDisponibilidadFecha.class.getSimpleName();
		Error error = new Error(exceptionName);
		JSONObject errorJsonResponse = new JSONObject(error);
		mvc.perform(post(URL_TICKETS).content(jsonTicketComman.toString()).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().json(errorJsonResponse.toString()));
	}

}
