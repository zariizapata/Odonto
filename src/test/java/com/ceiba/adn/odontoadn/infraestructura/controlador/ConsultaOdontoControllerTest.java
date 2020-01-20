package com.ceiba.adn.odontoadn.infraestructura.controlador;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.ceiba.adn.odontoadn.dominio.comando.modelo.entidad.Odonto;
import com.ceiba.adn.odontoadn.dominio.comando.puerto.repositorio.RepositorioOdonto;
import com.ceiba.adn.odontoadn.dominio.comando.servicio.ServicioCrearOdonto;
import com.ceiba.adn.odontoadn.infraestructura.comando.controlador.ComandoOdontoController;


public class ConsultaOdontoControllerTest {

	
	
	private MockMvc mockMvc;

    @Before(value = "")
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new ConsultaOdontoControllerTest()).build();
    }

    @Test
    public void testHomePage() throws Exception {
        this.mockMvc.perform(get("/api/odonto"))
                .andExpect(status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
	
//	
//	@Test
//	public void crear() {
//		Odonto odonto = new Odonto();
//		odonto.setCedulaPacienite("1035432774");
//		odonto.setEstadoCita("Pendiente");
//		odonto.setFechaAsignacionCita("23/01/2020");
//		odonto.setTipoServicio("Blanqueamiento");
//		odonto.setHoraAsingacionCita("05:45");
//		odonto.setTelefonoContacto("4012596");
//		odonto.setMedicoAsignado("Camilo Calderon");
//		odonto.setNombrePaciente("Sara Zapata");
//		//when(repositorioOdontoMock.crear(odonto)).thenReturn(odonto);
//		
//		Odonto odonto2 = new OdontoTest().build();
//		RepositorioOdonto repositorioOdonto = Mockito.mock(RepositorioOdonto.class);
//		Mockito.when(repositorioOdonto.existe(Mockito.any())).thenReturn(false);
//		//Act
//		ServicioCrearOdonto servicioCrearOdonto = new ServicioCrearOdonto(repositorioOdonto);
//		//Assert
//		BasePrueba.assertThrows(() -> servicioCrearOdonto.ejecutar(odonto), ExcepcionDuplicidad.class,"Los dias miercoles no se realizan blanqueamientos");
//		
//		
//	}
}
