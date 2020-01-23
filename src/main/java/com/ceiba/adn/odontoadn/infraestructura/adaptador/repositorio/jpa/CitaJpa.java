package com.ceiba.adn.odontoadn.infraestructura.adaptador.repositorio.jpa;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaCita;
import com.ceiba.adn.odontoadn.infraestructura.adaptador.entidad.EntidadCita;

public interface CitaJpa extends CrudRepository<EntidadCita, Long> {

	@Query("select count(*) from EntidadCita od where od.fecha=:fecha and od.hora=:hora and od.medico=:medico")
	long validarfechasJpa(@Param("fecha") Date fecha, @Param("hora") String hora, @Param("medico") String medico);

	@Query("select new com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaCita(con.id,con.fecha,con.hora, con.cedula,con.nombre,con.tipo,con.estado, con.medico,con.telefono,con.tarifa) from EntidadCita con ")
	List<ConsultaCita> listarConsultaOdonto();

	@Query("select new com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaCita(con.id,con.fecha,con.hora, con.cedula,con.nombre,con.tipo,con.estado, con.medico,con.telefono,con.tarifa) from EntidadCita con where con.id= :id ")
	ConsultaCita buscarConsultaOdonto(@Param("id") Long id);

}
