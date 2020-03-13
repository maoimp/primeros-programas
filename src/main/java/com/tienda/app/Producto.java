package com.tienda.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //sirve para asociar una clase normal a una tabla de una  base de datos 
@Table (name="PRODUCTOS")
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4966080131795607070L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idproducto;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="TIPO")
	private String tipo;
	
	@Column(name="DESCRIPCION")
	private String descripcion;

	public long getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
