package com.nttdata.jccspringtaller1.services;

import java.util.List;

import com.nttdata.jccspringtaller1.persistence.NttdataPersona;

public interface NttdataManejoEdificioServiceI {
	
	
	public void insert(final NttdataPersona newPersona);
	
	public List<NttdataPersona> showPersonas();
	
	public List<NttdataPersona> searchPersona(String nombre, String apellido);

}
