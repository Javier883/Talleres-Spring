package com.nttdata.jccspringtaller1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.jccspringtaller1.persistence.NttdataPersona;
import com.nttdata.jccspringtaller1.persistence.NttdataPersonaDaoI;

@Service
public class NttdataManejoEdificioServiceImpl implements NttdataManejoEdificioServiceI {
	
	@Autowired
	private NttdataPersonaDaoI personaDao;
	
	
    @Override
	public void insert(NttdataPersona newPersona) {
		personaDao.insert(newPersona);
		
	}

	@Override
	public List<NttdataPersona> showPersonas() {
		return personaDao.showPersonas();
	}

	@Override
	public List<NttdataPersona> searchPersona(String nombre, String apellido) {
		return  personaDao.searchPersona(nombre, apellido);
	}

}
