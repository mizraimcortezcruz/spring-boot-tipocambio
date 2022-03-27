package com.bcp.springboot.tipocambio.app.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tipocambio")
public class TipoCambio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "montoOrigen")
	private Double montoOrigen;
	@Column(name = "monedaOrigen")
	private String monedaOrigen;
	@Column(name = "montoDestino")
	private Double montoDestino;
	@Column(name = "monedaDestino")
	private String monedaDestino;
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;
	@Column(name = "usuarioCreacion")
	private String usuarioCreacion;
	@Column(name = "fechaModificacion")
	private Date fechaModificacion;
	@Column(name = "usuarioModificacion")
	private String usuarioModificacion;
	public TipoCambio() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getMontoOrigen() {
		return montoOrigen;
	}
	public void setMontoOrigen(Double montoOrigen) {
		this.montoOrigen = montoOrigen;
	}
	public String getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public Double getMontoDestino() {
		return montoDestino;
	}
	public void setMontoDestino(Double montoDestino) {
		this.montoDestino = montoDestino;
	}
	public String getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	
	
}
