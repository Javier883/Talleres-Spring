package com.nttdata.jccspringtaller1.persistence;

import org.springframework.stereotype.Component;

/**
 * 
 * Taller 1 Spring
 * 
 * @author Campos
 *
 */
@Component
public class NttdataPersona {
	
	/** Nombre de la persona */
	
	private String nombre;
	
	/** Apellido de la persona */
	
	private String apellido;
	
	
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



}
