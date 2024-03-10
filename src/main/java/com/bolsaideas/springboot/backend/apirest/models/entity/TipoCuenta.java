package com.bolsaideas.springboot.backend.apirest.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_cuenta")
public class TipoCuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo_cuenta;
	private Double descripcion_tipo_cuenta;
	
	public Long getId_tipo_cuenta() {
		return id_tipo_cuenta;
	}
	public void setId_tipo_cuenta(Long id_tipo_cuenta) {
		this.id_tipo_cuenta = id_tipo_cuenta;
	}
	public Double getDescripcion_tipo_cuenta() {
		return descripcion_tipo_cuenta;
	}
	public void setDescripcion_tipo_cuenta(Double descripcion_tipo_cuenta) {
		this.descripcion_tipo_cuenta = descripcion_tipo_cuenta;
	}
	
	
	
	
	

}
