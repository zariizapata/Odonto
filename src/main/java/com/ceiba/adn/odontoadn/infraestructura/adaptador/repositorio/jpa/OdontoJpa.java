package com.ceiba.adn.odontoadn.infraestructura.adaptador.repositorio.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto;
import com.ceiba.adn.odontoadn.infraestructura.adaptador.entidad.OdontoEntidad;

public interface OdontoJpa extends CrudRepository<OdontoEntidad, Long> {
	// 2

	@Query("select count(*) from OdontoEntidad od where od.fecha=:fecha and od.hora=:hora and od.medico=:medico")
	long validarfechasJpa(@Param("fecha") String fecha, @Param("hora") String hora, @Param("medico") String medico);

	@Query("select new com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto(con.id,con.fecha,con.hora, con.cedula,con.nombre,con.tipo,con.estado, con.medico,con.telefono,con.tarifa) from OdontoEntidad con ")
	List<ConsultaListarOdonto> listarConsultaOdonto();

	@Query("select new com.ceiba.adn.odontoadn.aplicacion.consulta.ConsultaListarOdonto(con.id,con.fecha,con.hora, con.cedula,con.nombre,con.tipo,con.estado, con.medico,con.telefono,con.tarifa) from OdontoEntidad con where con.id= :id ")
	ConsultaListarOdonto buscarConsultaOdonto(@Param("id") Long id);

}
