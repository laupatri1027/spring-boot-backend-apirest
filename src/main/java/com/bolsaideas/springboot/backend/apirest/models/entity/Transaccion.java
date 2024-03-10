package com.bolsaideas.springboot.backend.apirest.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "transacciones")
public class Transaccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_transaccion;
	private Double monto;
	@Column(name="fecha_transaccion")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_transaccion;
	
	@OneToOne(fetch = FetchType.LAZY)
	private TipoTransaccion tipoTransaccion;
	
	public Long getId_transaccion() {
		return id_transaccion;
	}
	public void setId_transaccion(Long id_transaccion) {
		this.id_transaccion = id_transaccion;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	public Date getFecha_transaccion() {
		return fecha_transaccion;
	}
	public void setFecha_transaccion(Date fecha_transaccion) {
		this.fecha_transaccion = fecha_transaccion;
	}
	
	

}
