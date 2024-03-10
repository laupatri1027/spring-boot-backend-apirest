package com.bolsaideas.springboot.backend.apirest.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_transaccion")
public class TipoTransaccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo_transaccion;
	private Double descripcion_tipo_transaccion;
	
	public Long getId_tipo_transaccion() {
		return id_tipo_transaccion;
	}
	public void setId_tipo_transaccion(Long id_tipo_transaccion) {
		this.id_tipo_transaccion = id_tipo_transaccion;
	}
	public Double getDescripcion_tipo_transaccion() {
		return descripcion_tipo_transaccion;
	}
	public void setDescripcion_tipo_transaccion(Double descripcion_tipo_transaccion) {
		this.descripcion_tipo_transaccion = descripcion_tipo_transaccion;
	}
	

	

}
