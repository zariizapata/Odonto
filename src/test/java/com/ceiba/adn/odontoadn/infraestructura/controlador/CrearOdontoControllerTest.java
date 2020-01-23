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
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ceiba.adn.odontoadn.ApplicationMock;
import com.ceiba.adn.odontoadn.OdontoadnApplication;
import com.ceiba.adn.odontoadn.aplicacion.comando.respuesta.manejadorcomandorespuesta.ManejadorComandoRespuesta;
import com.ceiba.adn.odontoadn.dominio.comando.servicio.OdontoTestCase;
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
	public void registerIncomeMotorcycle() throws Exception {
		JSONObject jsonTicketComman = new JSONObject("{ \n" + 
				"   \"cedulaPacienite\":\"1035432774\",\n" + 
				"   \"estadoCita\":\"Pendiente\",\n" + 
				"   \"fechaAsignacionCita\":\"20/01/2020\",\n" + 
				"   \"horaAsingacionCita\":\"10:50\",\n" + 
				"   \"medicoAsignado\":\"Camilo Calderon\",\n" + 
				"   \"nombrePaciente\":\"SARA ZAPATA\",\n" + 
				"   \"tarifaCancelar\":\"50000\",\n" + 
				"   \"telefonoContacto\":\"40405554\",\n" + 
				"   \"tipoServicio\":\"Blanqueamiento\"\n" + 
				"}");
		
 
        this.mvc.perform(MockMvcRequestBuilders
                    .post(URL_TICKETS)
                    .content(jsonTicketComman.toString())
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());

	}

}
