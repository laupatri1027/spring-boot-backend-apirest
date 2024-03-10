package com.bolsaideas.springboot.backend.apirest.models.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuentas")
public class Cuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cuenta;
	private Double saldo_cuenta;
	private Long id_tipo_cuenta;
	
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "transaccion_id")
	private List<Transaccion> transacciones;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	private TipoCuenta tipoCuenta;
	
	public Long getId_cuenta() {
		return id_cuenta;
	}
	public void setId_cuenta(Long id_cuenta) {
		this.id_cuenta = id_cuenta;
	}
	public Double getSaldo_cuenta() {
		return saldo_cuenta;
	}
	public void setSaldo_cuenta(Double saldo_cuenta) {
		this.saldo_cuenta = saldo_cuenta;
	}
	public Long getId_tipo_cuenta() {
		return id_tipo_cuenta;
	}
	public void setId_tipo_cuenta(Long id_tipo_cuenta) {
		this.id_tipo_cuenta = id_tipo_cuenta;
	}
	public List<Transaccion> getTransacciones() {
		return transacciones;
	}
	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	

}
