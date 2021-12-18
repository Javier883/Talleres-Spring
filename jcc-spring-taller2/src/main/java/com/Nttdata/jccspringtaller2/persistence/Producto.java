package com.Nttdata.jccspringtaller2.persistence;

import org.springframework.stereotype.Component;


public class Producto {
	
	private int ID ;
	
	private String nombre;
	
	private double precioPVP;
	
	private double precio;
	
	
	public Producto() {
		this.ID ++;
	}


	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}


	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}


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
	 * @return the precioPVP
	 */
	public double getPrecioPVP() {
		return precioPVP;
	}


	/**
	 * @param precioPVP the precioPVP to set
	 */
	public void setPrecioPVP(double precioPVP) {
		this.precioPVP = precioPVP;
	}


	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
