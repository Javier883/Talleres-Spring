package com.nttdata.jccspringtaller1.persistence;

import java.util.List;

public interface NttdataPersonaDaoI {
	
    public void insert(final NttdataPersona newPersona);
	
	public List<NttdataPersona> showPersonas();
	
	public List<NttdataPersona> searchPersona(String nombre, String apellidos);

}
