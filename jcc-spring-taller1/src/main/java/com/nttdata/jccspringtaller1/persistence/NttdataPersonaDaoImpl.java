package com.nttdata.jccspringtaller1.persistence;

import java.util.ArrayList;

import java.util.List;



import org.springframework.stereotype.Repository;

@Repository
public class NttdataPersonaDaoImpl implements NttdataPersonaDaoI{
	
	
	private NttdataEdificio edificio;
	
	public NttdataPersonaDaoImpl () {
		this.edificio = new NttdataEdificio();
	}

	@Override
	public void insert(NttdataPersona newPersona) {
		
		for (int i = 0; i < edificio.getPisos(); i++) {
            for (int j = 0; j < edificio.getApartamentos(); j++) {
                if (edificio.getEdificio()[i][j] == null) {
                    edificio.getEdificio()[i][j] = newPersona;
                    return;
                }
            }
        }
		
	}

	@Override
	public List<NttdataPersona> showPersonas() {
		List<NttdataPersona> list = new ArrayList<>();

        for (int i = 0; i < edificio.getPisos(); i++) {
            for (int j = 0; j < edificio.getApartamentos(); j++) {

                NttdataPersona x = edificio.getEdificio()[i][j];

                if (x != null) {
                    list.add(x);
                }
            }
        }
        return list;
	}

	@Override
	public List<NttdataPersona> searchPersona(String nombre, String apellidos) {
		 List<NttdataPersona> list = new ArrayList<>();

	        for (int i = 0; i < edificio.getPisos(); i++) {
	            for (int j = 0; j < edificio.getApartamentos(); j++) {

	                NttdataPersona x = edificio.getEdificio()[i][j];

	                if (x != null && x.getNombre() == nombre && x.getApellido() == apellidos) {
	                    list.add(x);
	                }
	            }
	        }
	        return  list;
	    }
	}


