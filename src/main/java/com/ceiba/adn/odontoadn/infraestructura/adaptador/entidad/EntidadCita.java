package com.ceiba.adn.odontoadn.infraestructura.adaptador.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tblcrearcitas")
public class EntidadCita implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "hora", nullable = false)
	private String hora;

	@Column(name = "cedula", nullable = false)
	private String cedula;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "tipo", nullable = false)
	private String tipo;

	@Column(name = "estado", nullable = false)
	private String estado;

	@Column(name = "medico", nullable = false)
	private String medico;

	@Column(name = "telefono", nullable = false)
	private String telefono;

	@Column(name = "tarifa", nullable = false)
	private String tarifa;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	private Date fecha;

}
