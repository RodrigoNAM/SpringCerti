package com.eCerticom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.Transient;

@Entity(name="t_expediente_documento")
@Table(name="t_expediente_documento")
public class Expediente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id; 
	
	@Transient
	private String checker;
	
	@Column(name = "nro_expediente")
	private String nro_expediente; 	
	
	@Column(name = "tipo_de_documento")
	private String tipo_de_documento;
	
	@Column(name = "numero_del_documento")
	private String numero_del_documento;
	
	@Column(name = "fecha_del_documento")
	private String fecha_del_documento;
	
	@Column(name = "numero_de_imagenes")
	private Integer numero_de_imagenes;
	
	@Column(name = "asunto")
	private String asunto;
	
	@Column(name = "datos_del_cliente")
	private String datos_del_cliente;
	
	@Column(name = "sede_oficina")
	private String sede_oficina;
	
	@Column(name = "firma_del_fedatario")
	private String firma_del_fedatario;
	
	@Column(name = "fecha_aprobacion_fedatario")
	private String fecha_aprobacion_fedatario;
	
	@Column(name = "observacion")
	private String observacion;
	
	@Column(name = "nombre_archivo")
	private String nombre_archivo;
	
	@Column(name = "ruta")
	private String ruta;
	
	@Column(name = "ubicacion")
	private String ubicacion;
	
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNro_expediente() {
		return nro_expediente;
	}
	public void setNro_expediente(String nro_expediente) {
		this.nro_expediente = nro_expediente;
	}
	public String getTipo_de_documento() {
		return tipo_de_documento;
	}
	public void setTipo_de_documento(String tipo_de_documento) {
		this.tipo_de_documento = tipo_de_documento;
	}
	public String getNumero_del_documento() {
		return numero_del_documento;
	}
	public void setNumero_del_documento(String numero_del_documento) {
		this.numero_del_documento = numero_del_documento;
	}
	public String getFecha_del_documento() {
		return fecha_del_documento;
	}
	public void setFecha_del_documento(String fecha_del_documento) {
		this.fecha_del_documento = fecha_del_documento;
	}
	public Integer getNumero_de_imagenes() {
		return numero_de_imagenes;
	}
	public void setNumero_de_imagenes(Integer numero_de_imagenes) {
		this.numero_de_imagenes = numero_de_imagenes;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getDatos_del_cliente() {
		return datos_del_cliente;
	}
	public void setDatos_del_cliente(String datos_del_cliente) {
		this.datos_del_cliente = datos_del_cliente;
	}
	public String getSede_oficina() {
		return sede_oficina;
	}
	public void setSede_oficina(String sede_oficina) {
		this.sede_oficina = sede_oficina;
	}
	public String getFirma_del_fedatario() {
		return firma_del_fedatario;
	}
	public void setFirma_del_fedatario(String firma_del_fedatario) {
		this.firma_del_fedatario = firma_del_fedatario;
	}
	public String getFecha_aprobacion_fedatario() {
		return fecha_aprobacion_fedatario;
	}
	public void setFecha_aprobacion_fedatario(String fecha_aprobacion_fedatario) {
		this.fecha_aprobacion_fedatario = fecha_aprobacion_fedatario;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getNombre_archivo() {
		return nombre_archivo;
	}
	public void setNombre_archivo(String nombre_archivo) {
		this.nombre_archivo = nombre_archivo;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	
}
