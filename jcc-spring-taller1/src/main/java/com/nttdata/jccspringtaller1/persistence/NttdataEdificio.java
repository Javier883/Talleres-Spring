package com.nttdata.jccspringtaller1.persistence;

public class NttdataEdificio {
	
	private NttdataPersona[][] edificio;
	final int pisos = 2;
	final int apartamentos = 2;
	
	public NttdataEdificio () {
		this.edificio = new NttdataPersona[pisos][apartamentos];
	}

	/**
	 * @return the edificio
	 */
	public NttdataPersona[][] getEdificio() {
		return edificio;
	}

	/**
	 * @return the pisos
	 */
	public int getPisos() {
		return pisos;
	}

	/**
	 * @return the apartamentos
	 */
	public int getApartamentos() {
		return apartamentos;
	}

	/**
	 * @param edificio the edificio to set
	 */
	public void setEdificio(NttdataPersona[][] edificio) {
		this.edificio = edificio;
	}
	
	

}
