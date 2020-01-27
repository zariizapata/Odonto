package com.ceiba.adn.odontoadn.infraestructura.controlador;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ceiba.adn.odontoadn.ApplicationMock;
import com.ceiba.adn.odontoadn.OdontoadnApplication;
import com.ceiba.adn.odontoadn.dominio.comando.servicio.OdontoTestCase;
import com.ceiba.adn.odontoadn.dominio.excepcion.ExcepcionDiasSinAtencion;
import com.ceiba.adn.odontoadn.infraestructura.adaptador.mapeador.MapeadorCita;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationMock.class)
@SpringBootTest(classes = OdontoadnApplication.class)
@AutoConfigureMockMvc
public class ComandoControladorTest {

	@Autowired
	private WebApplicationContext wac;
	private OdontoTestCase ticketBuilder;
	
	private MockMvc mvc;
	private static final String URL_ODONTOLOGIA = "/api/odontologia/";
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

	private static final String LIMPIEZA = "Limpieza";

	private MapeadorCita map;
	
	@Before
	public void setUp() {
		this.mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void ActualizarCita() throws Exception {
		JSONObject jsonTicketComman = new JSONObject("{\n" + 
				"        \"id\": 1,\n" + 
				"        \"fecha\": \"2020-09-03T00:00:00.000+0000\",\n" + 
				"        \"hora\": \"21:38\",\n" + 
				"        \"cedula\": \"1035432774\",\n" + 
				"        \"nombre\": \"SARA ZAPATA\",\n" + 
				"        \"tipo\": \"Limpieza\",\n" + 
				"        \"estado\": \"Pagado\",\n" + 
				"        \"medico\": \"Camilo Calderon\",\n" + 
				"        \"telefono\": \"40405554\",\n" + 
				"        \"tarifa\": \"50000\"\n" + 
				"    }");		
		
 
        this.mvc.perform(MockMvcRequestBuilders
                    .put(URL_ODONTOLOGIA)
                    .contentType(MediaType.APPLICATION_JSON)
        			.content(jsonTicketComman.toString()))
                    .andExpect(status().isOk());

	}
	
	@Test
	public void registrarCita() throws Exception {
		JSONObject jsonTicketComman = new JSONObject("{ \n" + 
				"   \"cedula\":\"1035432774\",\n" + 
				"   \"estado\":\"Pendiente\",\n" + 
				"   \"fecha\":\"2020-10-22\",\n" + 
				"   \"hora\":\"10:50\",\n" + 
				"   \"medico\":\"Camilo Calderon\",\n" + 
				"   \"nombre\":\"SARA ZAPATA\",\n" + 
				"   \"tarifa\":\"50000\",\n" + 
				"   \"telefono\":\"40405554\",\n" + 
				"   \"tipo\":\"Limpieza\"\n" + 
				"}");		
		
 
        this.mvc.perform(MockMvcRequestBuilders
                    .post(URL_ODONTOLOGIA)
                    .contentType(MediaType.APPLICATION_JSON)
        			.content(jsonTicketComman.toString()))
                    .andExpect(status().isOk());

	}
	
	@Test
	public void ErrorNoPrestaServicioMiercolesBlanqueamiento() throws Exception {
		JSONObject jsonTicketComman = new JSONObject("{ \n" + 
				"   \"cedula\":\"1035432774\",\n" + 
				"   \"estado\":\"Pendiente\",\n" + 
				"   \"fecha\":\"2020-01-23\",\n" + 
				"   \"hora\":\"10:50\",\n" + 
				"   \"medico\":\"Camilo Calderon\",\n" + 
				"   \"nombre\":\"SARA ZAPATA\",\n" + 
				"   \"tarifa\":\"50000\",\n" + 
				"   \"telefono\":\"40405554\",\n" + 
				"   \"tipo\":\"Blanqueamiento\"\n" + 
				"}");		
		
 
        this.mvc.perform(MockMvcRequestBuilders
                    .post(URL_ODONTOLOGIA)
                    .contentType(MediaType.APPLICATION_JSON)
        			.content(jsonTicketComman.toString()))
                    .andExpect(status().isBadRequest())
                    .andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionDiasSinAtencion.class.getSimpleName()))
            		.andExpect(jsonPath("$.mensaje").value(String.format(NOBLANQUEAMIENTO)));;

	}
	
	@Test
	public void ErrorNoServicioFinDeSemana() throws Exception {
		JSONObject jsonTicketComman = new JSONObject("{ \n" + 
				"   \"cedula\":\"1035432774\",\n" + 
				"   \"estado\":\"Pendiente\",\n" + 
				"   \"fecha\":\"2020-01-26\",\n" + 
				"   \"hora\":\"10:50\",\n" + 
				"   \"medico\":\"Camilo Calderon\",\n" + 
				"   \"nombre\":\"SARA ZAPATA\",\n" + 
				"   \"tarifa\":\"50000\",\n" + 
				"   \"telefono\":\"40405554\",\n" + 
				"   \"tipo\":\"Blanqueamiento\"\n" + 
				"}");		
		
 
        this.mvc.perform(MockMvcRequestBuilders
                    .post(URL_ODONTOLOGIA)
                    .contentType(MediaType.APPLICATION_JSON)
        			.content(jsonTicketComman.toString()))
                    .andExpect(status().isBadRequest())
                    .andExpect(jsonPath("$.nombreExcepcion").value(ExcepcionDiasSinAtencion.class.getSimpleName()))
            		.andExpect(jsonPath("$.mensaje").value(String.format(NOSABADODOMINGO)));;

	}
	

}
