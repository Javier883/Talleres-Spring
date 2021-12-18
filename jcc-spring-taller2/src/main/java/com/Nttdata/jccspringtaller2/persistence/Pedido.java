package com.Nttdata.jccspringtaller2.persistence;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Pedido {
	
	private int ID ;
    
	private String destinatario;
	
	private String direccion;
	
	private boolean peninsula;
	
	List<Producto> producto;
	
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
	 * @return the destinatario
	 */
	public String getDestinatario() {
		return destinatario;
	}

	/**
	 * @param destinatario the destinatario to set
	 */
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the peninsula
	 */
	public boolean isPeninsula() {
		return peninsula;
	}

	/**
	 * @param peninsula the peninsula to set
	 */
	public void setPeninsula(boolean peninsula) {
		this.peninsula = peninsula;
	}

	/**
	 * @return the producto
	 */
	public List<Producto> getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	
	

}
